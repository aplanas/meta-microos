SUMMARY = "Python interface to the mpv media player"
DESCRIPTION = "A ctypes-based python interface to the mpv media player. \
It gives more or less full control of all features of the player, \
just like the lua interface does."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.0.3"

RPM_NAME = "python39-python-mpv-1.0.3-2.3.noarch.rpm"
RPM_HASH = "93f6465d39e970b9890561871dca4dbe5d3670d40d9fd9e9c987506668b5396c9fceb698521d1a9bc707ee238da7b72594b958fb1efa4f562ad7c181fb627702"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-mpv \
python39-python-mpv \
python3dist-python-mpv"

RDEPENDS:${PN} += "libmpv2 \
python-abi"

inherit rpm
