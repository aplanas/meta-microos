SUMMARY = "Standard C++ Library Locales"
DESCRIPTION = "The standard C++ library locale data."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.1.1+git7364"

RPM_NAME = "libstdc++6-locale-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "d5d59fad01a0bd04b7df2af8213667ea0b63a901c251e9a5776ffd027d704d3cb8fb1efba3ae500e1bde0ae9a76b61476e024afaed50e44984e55e2c1c40e4f8"

RPROVIDES:${PN} += "libstdc++6-locale \
locale-libstdc++6-de \
locale-libstdc++6-fr"

RDEPENDS:${PN} += ""

inherit rpm
