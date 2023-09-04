SUMMARY = "Header files for kcodecs, a method collection for string manipulation"
DESCRIPTION = "Development files for KCodecs, a method collection to manipulate \
strings using various encodings."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kcodecs-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "48006a89f988bba196e6bc995e36645ac65021532f1a166ceae472d9d6fe81b8d103c67393827b9873d28ed8efda032123295c24a762b1a7ec0b7ccb29173b86"

RPROVIDES:${PN} += "cmake-KF5Codecs \
kcodecs-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
libKF5Codecs5"

inherit rpm
