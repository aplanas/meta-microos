SUMMARY = "Development files for the D standard library"
DESCRIPTION = "This package contains the Phobos development files necessary for developing \
with LDC."
LICENSE = "Artistic-1.0 & BSD-3-Clause"

PV = "1.32.2"

RPM_NAME = "ldc-phobos-devel-1.32.2-1.1.aarch64.rpm"
RPM_HASH = "ffd49a17b9f95aee75f7f442a2b3b833fee77463b56bd101dba686cf1b29d3a077d3024b0015ce45117071e224d97fb9442ecea5a5ae81179627c67354c1625e"

RPROVIDES:${PN} += "ldc-phobos-devel"

RDEPENDS:${PN} += "ldc-runtime-devel \
libphobos2-ldc102"

inherit rpm
