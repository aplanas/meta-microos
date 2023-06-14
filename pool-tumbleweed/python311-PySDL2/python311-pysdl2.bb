SUMMARY = "Python ctypes wrapper around SDL2"
DESCRIPTION = "PySDL2 is a pure Python wrapper around the SDL2, SDL2_mixer, SDL2_image, \
SDL2_ttf, and SDL2_gfx libraries. Instead of relying on C code, it uses \
the built-in ctypes module to interface with SDL2, and provides simple \
Python classes and wrappers for common SDL2 functionality."
LICENSE = "SUSE-Public-Domain"

PV = "0.9.14"

RPM_NAME = "python311-PySDL2-0.9.14-2.3.noarch.rpm"
RPM_HASH = "4ddca11f52498b22c81b734d82700cc5dced4d1d149f52a8ff661ad9243303a9a263800f2689968475b1e14c37c35bfad01d856cf8056360f759169e08d8dfb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pysdl2 \
python311-PySDL2 \
python3dist-pysdl2"

RDEPENDS:${PN} += "SDL2 \
SDL2-gfx \
SDL2-image \
SDL2-mixer \
SDL2-ttf \
python-abi"

inherit rpm
