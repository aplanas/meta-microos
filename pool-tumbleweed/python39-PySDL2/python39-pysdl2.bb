SUMMARY = "Python ctypes wrapper around SDL2"
DESCRIPTION = "PySDL2 is a pure Python wrapper around the SDL2, SDL2_mixer, SDL2_image, \
SDL2_ttf, and SDL2_gfx libraries. Instead of relying on C code, it uses \
the built-in ctypes module to interface with SDL2, and provides simple \
Python classes and wrappers for common SDL2 functionality."
LICENSE = "SUSE-Public-Domain"

PV = "0.9.14"

RPM_NAME = "python39-PySDL2-0.9.14-2.5.noarch.rpm"
RPM_HASH = "cdffb3e21034fc41e47cae7cc3f6a160f67a86899fa3bcb4725faf4bd6158ff9124471d71217a2338532652d6f0edb4a928d88f9259296ff0cba5f408dbd844c"
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
