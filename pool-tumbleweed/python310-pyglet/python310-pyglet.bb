SUMMARY = "Windowing and multimedia library"
DESCRIPTION = "Pyglet provides an object-oriented programming interface for \
developing games and other visually-rich applications."
LICENSE = "BSD-3-Clause & MIT"

PV = "2.0.5"

RPM_NAME = "python310-pyglet-2.0.5-1.2.noarch.rpm"
RPM_HASH = "f9f771d8729dc3bc0a20c48a17b2c9151fd6621ca57c9bee2c9b5ef4fc11a9c7254880dddc89c00a1875c683ff67fcb58a4dc9ca82db29b33a44a5ca2e887e94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyglet \
python310-pyglet \
python3dist-pyglet"

RDEPENDS:${PN} += "Mesa-dri \
libxcb-glx0 \
python-abi \
python310-Pillow \
python310-future \
python310-pypng"

inherit rpm
