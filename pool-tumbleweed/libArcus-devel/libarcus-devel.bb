SUMMARY = "Header files for libArcus"
DESCRIPTION = "The libArcus-devel package includes the header files, libraries and development \
tools necessary for compiling and linking programs which use libArcus."
LICENSE = "LGPL-3.0-only"

PV = "4.13.1"

RPM_NAME = "libArcus-devel-4.13.1-4.1.aarch64.rpm"
RPM_HASH = "8cd76438a28942af10254d648f5bb9abe4810c960c465295942243572c4ae343ee91eadf99693ff0197994ac7dc432420032580a5516a975f1ab9e1d83ed3e4f"

RPROVIDES:${PN} += "cmake-Arcus \
libArcus-devel"

RDEPENDS:${PN} += "libArcus3 \
protobuf-devel \
python3-sip4-devel"

inherit rpm
