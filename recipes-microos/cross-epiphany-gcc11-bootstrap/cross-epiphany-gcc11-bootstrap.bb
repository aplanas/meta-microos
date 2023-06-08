SUMMARY = "The GNU Compiler Collection targeting epiphany"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting epiphany. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "cross-epiphany-gcc11-bootstrap-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "d2e5948dfd8ba43459aa0e0befc08a4d01fe2e429a9ac098367ce9ff60451c98fb2a8c1c3bc7939496c3f7f1d7ac896b2674350b1516738b967520e819779022"

RPROVIDES:${PN} += "cross-epiphany-gcc11-bootstrap cross-epiphany-gcc11-bootstrap(aarch-64) epiphany-elf-gcc"
RDEPENDS:${PN} += "/bin/sh cross-epiphany-binutils update-alternatives"

inherit rpm
