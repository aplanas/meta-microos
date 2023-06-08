SUMMARY = "The GNU Compiler Collection targeting rx"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting rx. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "cross-rx-gcc11-bootstrap-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "826071ce54072d6a56cfb2140c1c4730f16152f2f2ae2d6abd2323be88a6c7de3b052cf8d6a1802a9ec29298cd06b333627f1d1866eb41693f2cde72b1a6abf6"

RPROVIDES:${PN} += "cross-rx-gcc11-bootstrap cross-rx-gcc11-bootstrap(aarch-64) rx-elf-gcc"
RDEPENDS:${PN} += "/bin/sh cross-rx-binutils update-alternatives"

inherit rpm
