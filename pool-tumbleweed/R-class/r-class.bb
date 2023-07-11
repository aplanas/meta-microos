SUMMARY = "Package provides recommended R-class"
DESCRIPTION = "This packages provides R-class, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "7.3.22"

RPM_NAME = "R-class-7.3.22-46.1.aarch64.rpm"
RPM_HASH = "70d9b24b8087048146c6f827c8e3cb1938be76f9e94f9c30d96a7ed42a91ba9f47d5ad6d391a30e4884befab716cfaf3834443c7b742dad354fb79aa147b13ca"

RPROVIDES:${PN} += "R-class"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6"

inherit rpm
