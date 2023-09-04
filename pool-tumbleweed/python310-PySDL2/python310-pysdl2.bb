SUMMARY = "Python ctypes wrapper around SDL2"
DESCRIPTION = "PySDL2 is a pure Python wrapper around the SDL2, SDL2_mixer, SDL2_image, \
SDL2_ttf, and SDL2_gfx libraries. Instead of relying on C code, it uses \
the built-in ctypes module to interface with SDL2, and provides simple \
Python classes and wrappers for common SDL2 functionality."
LICENSE = "SUSE-Public-Domain"

PV = "0.9.16"

RPM_NAME = "python310-PySDL2-0.9.16-2.1.noarch.rpm"
RPM_HASH = "813ffdd5c764db28fa572bff8c065874b1025c626671dfa15583088d73716b1e530ff46f8bbb6db93fc07c15d6450d7ee6f99d935ccd543326e0de366ee9d8b6"
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
