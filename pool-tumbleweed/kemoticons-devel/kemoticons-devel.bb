SUMMARY = "Build environment for kemoticons, an emoticon text converter"
DESCRIPTION = "KEmoticons converts emoticons from text to a graphical representation with \
images in HTML. It supports setting different themes for emoticons coming \
from different providers. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kemoticons-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "32212bc6d725194b81da3ab01a0d2a6db57c94ff7eb2dc5c9f8b866407ea25e354f10983343ec8794a1d23578be9fc0f1d6b37a0dd9262ed9ddbd1e6a5d1ce08"

RPROVIDES:${PN} += "cmake-KF5Emoticons \
kemoticons-devel"

RDEPENDS:${PN} += "cmake-KF5Archive \
cmake-KF5Service \
cmake-Qt5Gui \
extra-cmake-modules \
libKF5Emoticons5"

inherit rpm
