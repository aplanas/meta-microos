SUMMARY = "Python interface to the mpv media player"
DESCRIPTION = "A ctypes-based python interface to the mpv media player. \
It gives more or less full control of all features of the player, \
just like the lua interface does."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.0.4"

RPM_NAME = "python310-python-mpv-1.0.4-1.1.noarch.rpm"
RPM_HASH = "431ef059ef97b096d7d9d0fc2f8363b614894a25cb66776d0e709b0b09cddeed7e2e39d8f4307aaa651d696cae6e4fbfabc717a1c2742a5dcdae7826aed193a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-mpv \
python310-python-mpv \
python3dist-python-mpv"

RDEPENDS:${PN} += "libmpv2 \
python-abi"

inherit rpm
