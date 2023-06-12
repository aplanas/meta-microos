SUMMARY = "Disk and net statistic monitoring systemtap scripts - GTK GUI"
DESCRIPTION = "GTK GUI that can control tuned and provide simple profile editor."
LICENSE = "GPL-2.0-or-later"

PV = "2.20.0.18+git.7b1a20b"

RPM_NAME = "tuned-gtk-2.20.0.18+git.7b1a20b-1.1.noarch.rpm"
RPM_HASH = "e5c0f53baeecd80d9cf4aed74c485b3e011079181cd56705771d57dd2aebf1cc7a56796a895ebc337b697b32b81980ad24c2f46fe7b143018f1403ec1f2518db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(tuned-gui.desktop) \
tuned-gtk"
RDEPENDS:${PN} += "/usr/bin/python3 \
powertop \
python(abi) \
tuned"

inherit rpm
