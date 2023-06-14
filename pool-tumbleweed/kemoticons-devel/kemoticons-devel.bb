SUMMARY = "Build environment for kemoticons, an emoticon text converter"
DESCRIPTION = "KEmoticons converts emoticons from text to a graphical representation with \
images in HTML. It supports setting different themes for emoticons coming \
from different providers. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kemoticons-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "7a5d5628792a2061ae3d91a23f23b7171e6a84799514ca9084b0a2946f43d886e7889f9979369c269741263c20c2e08c67d6631b61df05b075cdb17500f4db8b"

RPROVIDES:${PN} += "cmake-KF5Emoticons \
kemoticons-devel"

RDEPENDS:${PN} += "cmake-KF5Archive \
cmake-KF5Service \
cmake-Qt5Gui \
extra-cmake-modules \
libKF5Emoticons5"

inherit rpm
