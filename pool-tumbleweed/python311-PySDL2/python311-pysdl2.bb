SUMMARY = "Python ctypes wrapper around SDL2"
DESCRIPTION = "PySDL2 is a pure Python wrapper around the SDL2, SDL2_mixer, SDL2_image, \
SDL2_ttf, and SDL2_gfx libraries. Instead of relying on C code, it uses \
the built-in ctypes module to interface with SDL2, and provides simple \
Python classes and wrappers for common SDL2 functionality."
LICENSE = "SUSE-Public-Domain"

PV = "0.9.14"

RPM_NAME = "python311-PySDL2-0.9.14-2.5.noarch.rpm"
RPM_HASH = "989d7a5121e922be71efcb2362d0566afbc1aff972553d8bea9ab213b32efce8ebb16b4bd787f5399d17845df4adac48ff9ead773e60c2e473f96d2fdfb699f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PySDL2 \
python3.11dist-pysdl2 \
python311-PySDL2 \
python3dist-pysdl2"

RDEPENDS:${PN} += "SDL2 \
SDL2-gfx \
SDL2-image \
SDL2-mixer \
SDL2-ttf \
python-abi"

inherit rpm
