SUMMARY = "Python interface to the mpv media player"
DESCRIPTION = "A ctypes-based python interface to the mpv media player. \
It gives more or less full control of all features of the player, \
just like the lua interface does."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.0.3"

RPM_NAME = "python39-python-mpv-1.0.3-2.2.noarch.rpm"
RPM_HASH = "d3f2af5a6037ea2b37a705cc162f5541018b578ef9dd87dd412ad4b0564aa23acd014b20405467603c90bef9962e7278299aa9f18668a41eae9d606171da58ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-mpv) \
python39-python-mpv \
python3dist(python-mpv)"
RDEPENDS:${PN} += "libmpv2 \
python(abi)"

inherit rpm
