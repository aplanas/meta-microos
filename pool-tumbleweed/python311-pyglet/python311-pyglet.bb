SUMMARY = "Windowing and multimedia library"
DESCRIPTION = "Pyglet provides an object-oriented programming interface for \
developing games and other visually-rich applications."
LICENSE = "BSD-3-Clause & MIT"

PV = "2.0.9"

RPM_NAME = "python311-pyglet-2.0.9-1.1.noarch.rpm"
RPM_HASH = "012ed169ae18f01b226099a62df78d9731eed162f0f8d5c1dcafeb8e1131155544b2f2860f674234a00a54abced6c4634e2f443091380ebd259190b126c16ff5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyglet \
python3.11dist-pyglet \
python311-pyglet \
python3dist-pyglet"

RDEPENDS:${PN} += "Mesa-dri \
libxcb-glx0 \
python-abi \
python311-Pillow \
python311-pypng"

inherit rpm
