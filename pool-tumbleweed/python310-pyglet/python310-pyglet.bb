SUMMARY = "Windowing and multimedia library"
DESCRIPTION = "Pyglet provides an object-oriented programming interface for \
developing games and other visually-rich applications."
LICENSE = "BSD-3-Clause & MIT"

PV = "2.0.9"

RPM_NAME = "python310-pyglet-2.0.9-1.1.noarch.rpm"
RPM_HASH = "3f8f3de6a4aff7f4a4a982f65b126fba05151830950af683a1b88b999f053b86bbeb474b689c0ecc30df0d5a4d5caaf8ffbdcee2431bb40b45e608524d6708bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyglet \
python310-pyglet \
python3dist-pyglet"

RDEPENDS:${PN} += "Mesa-dri \
libxcb-glx0 \
python-abi \
python310-Pillow \
python310-pypng"

inherit rpm
