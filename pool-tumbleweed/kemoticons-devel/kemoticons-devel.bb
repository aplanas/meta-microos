SUMMARY = "Build environment for kemoticons, an emoticon text converter"
DESCRIPTION = "KEmoticons converts emoticons from text to a graphical representation with \
images in HTML. It supports setting different themes for emoticons coming \
from different providers. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kemoticons-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "de2c393ee3359cea560adc035f627236ae381618ffcf71e8965a7dd60bad763d76c31060b89ba7c116292281979064a3d26067310b6b7115869d454ea14c86cb"

RPROVIDES:${PN} += "cmake-KF5Emoticons \
kemoticons-devel"

RDEPENDS:${PN} += "cmake-KF5Archive \
cmake-KF5Service \
cmake-Qt5Gui \
extra-cmake-modules \
libKF5Emoticons5"

inherit rpm
