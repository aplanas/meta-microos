SUMMARY = "Header files for kcodecs, a method collection for string manipulation"
DESCRIPTION = "Development files for KCodecs, a method collection to manipulate \
strings using various encodings."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kcodecs-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "63c5536030c5c7b76b93b63c851dd92c149a74a86d06a85a67110420cf6de0c71087369f8bdc07ddcf8f078887262c8a48a8153fab8bc8134ea8d591cfde4db1"

RPROVIDES:${PN} += "cmake(KF5Codecs) \
kcodecs-devel \
kcodecs-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(Qt5Core) \
extra-cmake-modules \
libKF5Codecs5"

inherit rpm
