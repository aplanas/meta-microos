SUMMARY = "Python interface to the mpv media player"
DESCRIPTION = "A ctypes-based python interface to the mpv media player. \
It gives more or less full control of all features of the player, \
just like the lua interface does."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.0.4"

RPM_NAME = "python311-python-mpv-1.0.4-1.1.noarch.rpm"
RPM_HASH = "2f4456890b08bc2ad253545b2cc8daf717598e7a9deed47832eae0ad7a39683d0de7b44a725ebb5db02a9144aed24180c2ffc821f33fe0fb1eb91eeabdfe42ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-mpv \
python3.11dist-python-mpv \
python311-python-mpv \
python3dist-python-mpv"

RDEPENDS:${PN} += "libmpv2 \
python-abi"

inherit rpm
