SUMMARY = "Development package for baloo5-widgets"
DESCRIPTION = "Development package for baloo5-widgets"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "23.08.0"

RPM_NAME = "baloo5-widgets-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "f4354e02b5d02f004ff692d656df3ea548583000a6080ab51f20284b9b6969d6a1ebeb111bc168241926d053a60b4866055c6eca767c0083936aa86969cf49f2"

RPROVIDES:${PN} += "baloo-widgets5-devel \
baloo5-widgets-devel \
cmake-KF5BalooWidgets"

RDEPENDS:${PN} += "baloo5-widgets \
cmake-KF5KIO \
cmake-Qt5Widgets"

inherit rpm
