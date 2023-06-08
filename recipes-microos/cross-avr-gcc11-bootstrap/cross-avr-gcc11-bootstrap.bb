SUMMARY = "The GNU Compiler Collection targeting avr"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting avr. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "cross-avr-gcc11-bootstrap-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "1094a7d52f49beab8dd2d6007e8ca38803175234caa6cc92071968d0b8d1bda21db014abb9c11f2306a269a3053df274eeb2e80abb055d916ed5e6759b4953ca"

RPROVIDES:${PN} += "cross-avr-gcc11-bootstrap cross-avr-gcc11-bootstrap(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cross-avr-binutils update-alternatives"

inherit rpm
