SUMMARY = "GUI interface for RepRap"
DESCRIPTION = "Pronterface is a featured G-code sender with graphical user interface. \
It controls the ReRap printer and integrates skeinforge. \
It is a part of Printrun."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0~rc7.1599393390.c451359"

RPM_NAME = "pronterface-2.0.0~rc7.1599393390.c451359-3.13.noarch.rpm"
RPM_HASH = "1cb6bb5d70cf181b9904cd54e5aa4b76aee7e1face493159df07d2247e4ee4a6af8156acf13b8b386743fccb5a0cd5755d3f36a1fa2c3f0028ac6deecb4d36c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pronterface"

RDEPENDS:${PN} += "/usr/bin/python3 \
pronsole \
python3-wxPython"

inherit rpm
