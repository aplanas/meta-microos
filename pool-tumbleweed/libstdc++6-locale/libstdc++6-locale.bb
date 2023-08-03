SUMMARY = "Standard C++ Library Locales"
DESCRIPTION = "The standard C++ library locale data."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.1.1+git7597"

RPM_NAME = "libstdc++6-locale-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "07a283221bddc11974021f6083c292942d0115cb104f62a754c6d290b94d8f3d06197bfe07123b2ddd243f5871dfdf871ebd9a9f10ba5fb9815cc3a38a227e90"

RPROVIDES:${PN} += "libstdc++6-locale \
locale-libstdc++6-de \
locale-libstdc++6-fr"

RDEPENDS:${PN} += ""

inherit rpm
