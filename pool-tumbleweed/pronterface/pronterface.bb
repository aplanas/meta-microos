SUMMARY = "GUI interface for RepRap"
DESCRIPTION = "Pronterface is a featured G-code sender with graphical user interface. \
It controls the ReRap printer and integrates skeinforge. \
It is a part of Printrun."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0~rc7.1599393390.c451359"

RPM_NAME = "pronterface-2.0.0~rc7.1599393390.c451359-3.12.noarch.rpm"
RPM_HASH = "3b5ef20a2b7b32e0cbf91ebb0b5377f80ebe59fb7a1f35c6d07e0653949d7593af1a8387cf61a8f891426c10689c4606b7d9dcbc719d8bffdd9eefe265dacfdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pronterface"

RDEPENDS:${PN} += "/usr/bin/python3 \
pronsole \
python3-wxPython"

inherit rpm
