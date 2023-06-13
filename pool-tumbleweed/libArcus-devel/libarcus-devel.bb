SUMMARY = "Header files for libArcus"
DESCRIPTION = "The libArcus-devel package includes the header files, libraries and development \
tools necessary for compiling and linking programs which use libArcus."
LICENSE = "LGPL-3.0-only"

PV = "4.13.1"

RPM_NAME = "libArcus-devel-4.13.1-3.12.aarch64.rpm"
RPM_HASH = "1c24eba3a304d2c22824c215bb4c65c4e05c6bb4b060c5911145b3ca52905c72805f17a88c5af4f710c7c22dbbaee1d53aa656ca11791984d89eac00bcbcce96"

RPROVIDES:${PN} += "cmake(Arcus) \
libArcus-devel \
libArcus-devel(aarch-64)"

RDEPENDS:${PN} += "libArcus3 \
protobuf-devel \
python3-sip-devel"

inherit rpm
