SUMMARY = "Python interface to the mpv media player"
DESCRIPTION = "A ctypes-based python interface to the mpv media player. \
It gives more or less full control of all features of the player, \
just like the lua interface does."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.0.3"

RPM_NAME = "python311-python-mpv-1.0.3-2.3.noarch.rpm"
RPM_HASH = "6532142824cc42082b2d5789706e2c1b7c85f0efe16230900e953c262ce9a1cb0e3ad3c70df446a06dd852c40a3fe004d07e7a0e976a16a89254244f88f48683"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-mpv \
python3.11dist-python-mpv \
python311-python-mpv \
python3dist-python-mpv"

RDEPENDS:${PN} += "libmpv2 \
python-abi"

inherit rpm
