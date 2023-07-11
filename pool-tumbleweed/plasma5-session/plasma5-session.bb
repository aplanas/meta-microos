SUMMARY = "KDE Plasma 5 X11 Session"
DESCRIPTION = "This package contains the startup scripts necessary to start a KDE \
Plasma 5 session with X11 from a display manager."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "plasma5-session-5.27.6-2.1.noarch.rpm"
RPM_HASH = "20071a674b3282b672a96017b698a8a23d27dce1aa386a8d77cc5558cc660efb97244c32a8d6647836356950c84ec1a7eb25b836cdd05afee16229d4590038b8"
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
