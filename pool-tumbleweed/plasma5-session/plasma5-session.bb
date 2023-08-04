SUMMARY = "KDE Plasma 5 X11 Session"
DESCRIPTION = "This package contains the startup scripts necessary to start a KDE \
Plasma 5 session with X11 from a display manager."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "plasma5-session-5.27.7-1.1.noarch.rpm"
RPM_HASH = "3862373154329f12c3feda0203f9a5975ac93ec5c952904b49b39bffd25040cae21754b4855987bf26aeb3e7b77adc6930e89d66b2fed317c88db4752065ae66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdebase4-session \
plasma5-session"

RDEPENDS:${PN} += "/usr/bin/cut \
/usr/bin/grep \
/usr/bin/sed \
/usr/bin/sh \
breeze \
breeze5-decoration \
khotkeys5 \
kwin5 \
libkscreen2-plugin \
plasma5-desktop \
plasma5-workspace \
polkit-kde-agent-5 \
powerdevil5 \
systemsettings5 \
update-alternatives"

inherit rpm
