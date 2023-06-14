SUMMARY = "Python interface to the mpv media player"
DESCRIPTION = "A ctypes-based python interface to the mpv media player. \
It gives more or less full control of all features of the player, \
just like the lua interface does."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.0.3"

RPM_NAME = "python310-python-mpv-1.0.3-2.2.noarch.rpm"
RPM_HASH = "e7a2815b8a3c38f08e43b29d2a94762151d913ffc88f0fc5e0ddbb54af30ae8000d5f42c02a64d990398060a4c6333d0b68217780093be8a81bca029f75a6777"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-mpv \
python3.10dist-python-mpv \
python310-python-mpv \
python3dist-python-mpv"

RDEPENDS:${PN} += "libmpv2 \
python-abi"

inherit rpm
