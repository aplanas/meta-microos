SUMMARY = "Windowing and multimedia library"
DESCRIPTION = "Pyglet provides an object-oriented programming interface for \
developing games and other visually-rich applications."
LICENSE = "BSD-3-Clause & MIT"

PV = "2.0.9"

RPM_NAME = "python39-pyglet-2.0.9-1.1.noarch.rpm"
RPM_HASH = "4a87e104f3eb41259bf6b5f54e1eccd6eb06910e8426e5dc9d55dd48a202951e4e0f53577f83ea52554febaf12e682e55e93b2f9ef9e3538ada0c12e8317f2bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyglet \
python39-pyglet \
python3dist-pyglet"

RDEPENDS:${PN} += "Mesa-dri \
libxcb-glx0 \
python-abi \
python39-Pillow \
python39-pypng"

inherit rpm
