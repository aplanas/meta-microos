SUMMARY = "Windowing and multimedia library"
DESCRIPTION = "Pyglet provides an object-oriented programming interface for \
developing games and other visually-rich applications."
LICENSE = "BSD-3-Clause & MIT"

PV = "2.0.5"

RPM_NAME = "python310-pyglet-2.0.5-1.1.noarch.rpm"
RPM_HASH = "e6c4f637713d4b5d17527ebb5465248cb64f232c21fd52b26fb991c0463a596e0ffbc689bda3910c124384ba931f7035ad32280d8a9d63917c04cab643f7948f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyglet \
python3.10dist-pyglet \
python310-pyglet \
python3dist-pyglet"

RDEPENDS:${PN} += "Mesa-dri \
libxcb-glx0 \
python-abi \
python310-Pillow \
python310-future \
python310-pypng"

inherit rpm
