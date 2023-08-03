SUMMARY = "Python interface to the mpv media player"
DESCRIPTION = "A ctypes-based python interface to the mpv media player. \
It gives more or less full control of all features of the player, \
just like the lua interface does."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.0.4"

RPM_NAME = "python39-python-mpv-1.0.4-1.1.noarch.rpm"
RPM_HASH = "cd548940ac97e4f9127b06a6bc80da6e35c0868f4552b930b46fd97525df289bdcd0e66fe3d8db993ec6ec504ecba453f931d8b101c342107cfe622088e8645d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-mpv \
python39-python-mpv \
python3dist-python-mpv"

RDEPENDS:${PN} += "libmpv2 \
python-abi"

inherit rpm
