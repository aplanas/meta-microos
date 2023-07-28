SUMMARY = "Python ctypes wrapper around SDL2"
DESCRIPTION = "PySDL2 is a pure Python wrapper around the SDL2, SDL2_mixer, SDL2_image, \
SDL2_ttf, and SDL2_gfx libraries. Instead of relying on C code, it uses \
the built-in ctypes module to interface with SDL2, and provides simple \
Python classes and wrappers for common SDL2 functionality."
LICENSE = "SUSE-Public-Domain"

PV = "0.9.16"

RPM_NAME = "python310-PySDL2-0.9.16-1.1.noarch.rpm"
RPM_HASH = "75245b879ee99dfb2716c3ece8a5f36e4b14af7d5e2d4f07f3e0e9e3e7ac366d9df659ae0df09f9c738008751d830e1996396098515aa59a01e632fa53374ff1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pysdl2 \
python310-PySDL2 \
python3dist-pysdl2"

RDEPENDS:${PN} += "SDL2 \
SDL2-gfx \
SDL2-image \
SDL2-mixer \
SDL2-ttf \
python-abi"

inherit rpm
