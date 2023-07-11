SUMMARY = "Python interface to the mpv media player"
DESCRIPTION = "A ctypes-based python interface to the mpv media player. \
It gives more or less full control of all features of the player, \
just like the lua interface does."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.0.3"

RPM_NAME = "python310-python-mpv-1.0.3-2.3.noarch.rpm"
RPM_HASH = "cdeb5a24bd58ebc9c8691379443b135adb434bf95199b00dab6ba02ec65415b730303f8025206e5466222e66268560c3c08e4d3cdcf4239b8166eccf830c5e2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-mpv \
python310-python-mpv \
python3dist-python-mpv"

RDEPENDS:${PN} += "libmpv2 \
python-abi"

inherit rpm
