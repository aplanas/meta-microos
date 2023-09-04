SUMMARY = "KDE Plasma 5 X11 Session"
DESCRIPTION = "This package contains the startup scripts necessary to start a KDE \
Plasma 5 session with X11 from a display manager."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "plasma5-session-5.27.7-3.1.noarch.rpm"
RPM_HASH = "05a5e48fdc351d8e9e7ccb98fd002213cdcf41609c5f03634294083d33df641566f75559001dd3a5f9563d73738ef0e6da025e0f8daa5762405d6f73f703a5ab"
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
