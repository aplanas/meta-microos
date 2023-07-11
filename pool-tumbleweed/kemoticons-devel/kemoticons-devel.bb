SUMMARY = "Build environment for kemoticons, an emoticon text converter"
DESCRIPTION = "KEmoticons converts emoticons from text to a graphical representation with \
images in HTML. It supports setting different themes for emoticons coming \
from different providers. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kemoticons-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "d2cf90f6fc5e6b252eeb8b2c65a835396c89400694510ebc9d4f681af15ec2fdbaac7eb564975ea677940230bd0bbf1bb68f5bcd53449269abbc2b25e9f12802"

RPROVIDES:${PN} += "cmake-KF5Emoticons \
kemoticons-devel"

RDEPENDS:${PN} += "cmake-KF5Archive \
cmake-KF5Service \
cmake-Qt5Gui \
extra-cmake-modules \
libKF5Emoticons5"

inherit rpm
