SUMMARY = "Package provides recommended R-spatial"
DESCRIPTION = "This packages provides R-spatial, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "7.3.16"

RPM_NAME = "R-spatial-7.3.16-46.1.aarch64.rpm"
RPM_HASH = "a26b80476f698cc1fcb9a5d35b9e8c70ea223e7cbdd580bae401ac758c58a7045ebab2e5aa597aba409ee853776066abe6ff12004f8af31c0c501849606381bc"

RPROVIDES:${PN} += "R-spatial"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6"

inherit rpm
