SUMMARY = "Python ctypes wrapper around SDL2"
DESCRIPTION = "PySDL2 is a pure Python wrapper around the SDL2, SDL2_mixer, SDL2_image, \
SDL2_ttf, and SDL2_gfx libraries. Instead of relying on C code, it uses \
the built-in ctypes module to interface with SDL2, and provides simple \
Python classes and wrappers for common SDL2 functionality."
LICENSE = "SUSE-Public-Domain"

PV = "0.9.14"

RPM_NAME = "python310-PySDL2-0.9.14-2.5.noarch.rpm"
RPM_HASH = "68ea499a72959115870eec695595ea634409936d1bd55583aed908e4456e71da48e19e8a7d52217c704a5650058ef9a3f87376130e6194247cce6f33442f94e7"
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
