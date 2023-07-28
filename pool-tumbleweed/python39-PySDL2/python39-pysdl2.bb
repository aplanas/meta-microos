SUMMARY = "Python ctypes wrapper around SDL2"
DESCRIPTION = "PySDL2 is a pure Python wrapper around the SDL2, SDL2_mixer, SDL2_image, \
SDL2_ttf, and SDL2_gfx libraries. Instead of relying on C code, it uses \
the built-in ctypes module to interface with SDL2, and provides simple \
Python classes and wrappers for common SDL2 functionality."
LICENSE = "SUSE-Public-Domain"

PV = "0.9.16"

RPM_NAME = "python39-PySDL2-0.9.16-1.1.noarch.rpm"
RPM_HASH = "e63e8c73c88bf966307defaf0bed12efb6e86161311e7a7a411e5e31a8dd187149c7e574787b1b6e40568b087e84d892db57ee2f3b4d9b1508acda8ad362abd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pysdl2 \
python39-PySDL2 \
python3dist-pysdl2"

RDEPENDS:${PN} += "SDL2 \
SDL2-gfx \
SDL2-image \
SDL2-mixer \
SDL2-ttf \
python-abi"

inherit rpm
