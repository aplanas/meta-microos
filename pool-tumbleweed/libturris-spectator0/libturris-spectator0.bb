SUMMARY = "System tray that downloads and display info about the Turris router"
DESCRIPTION = "Spectator, systray tool to display various informations about the \
Turris router from CZ.nic"
LICENSE = "GPL-3.0+"

PV = "0.6+git74.9ef0de5"

RPM_NAME = "libturris-spectator0-0.6+git74.9ef0de5-1.28.aarch64.rpm"
RPM_HASH = "75665a795259888dd99bd55cdf55292fd67a13c59e2ab535cb7ae762457aa97de8d75701841b8a30cb2ff9b5d4f606df108e500e4c2cca8f88944e46d84bd638"

RPROVIDES:${PN} += "libturris-spectator.so.0 \
libturris-spectator0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
