SUMMARY = "KDE Plasma 5 X11 Session"
DESCRIPTION = "This package contains the startup scripts necessary to start a KDE \
Plasma 5 session with X11 from a display manager."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "plasma5-session-5.27.5-2.4.noarch.rpm"
RPM_HASH = "1f4b716510f4cef4f052f8671b0c69a826c36ebb38b2322e5f07fdff57d454b5f66aebde2aac4c1ef022c4cc20d23c2cf88cdf15f421821cb7cd10cd068b6274"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdebase4-session \
plasma5-session"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/cut \
/usr/bin/grep \
/usr/bin/sed \
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
