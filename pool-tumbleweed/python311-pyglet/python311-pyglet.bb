SUMMARY = "Windowing and multimedia library"
DESCRIPTION = "Pyglet provides an object-oriented programming interface for \
developing games and other visually-rich applications."
LICENSE = "BSD-3-Clause & MIT"

PV = "2.0.5"

RPM_NAME = "python311-pyglet-2.0.5-1.1.noarch.rpm"
RPM_HASH = "48ec444e584f4d13765da22bc2f8f96cf39c8570a72d6503fa9ff75fb925661da468603d0aa79bd48cc5b157bdc6ea77c2c2a585d442eb56bbdf3f430b973358"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyglet) \
python311-pyglet \
python3dist(pyglet)"

RDEPENDS:${PN} += "Mesa-dri \
libxcb-glx0 \
python(abi) \
python311-Pillow \
python311-future \
python311-pypng"

inherit rpm
