SUMMARY = "Python ctypes wrapper around SDL2"
DESCRIPTION = "PySDL2 is a pure Python wrapper around the SDL2, SDL2_mixer, SDL2_image, \
SDL2_ttf, and SDL2_gfx libraries. Instead of relying on C code, it uses \
the built-in ctypes module to interface with SDL2, and provides simple \
Python classes and wrappers for common SDL2 functionality."
LICENSE = "SUSE-Public-Domain"

PV = "0.9.16"

RPM_NAME = "python311-PySDL2-0.9.16-1.1.noarch.rpm"
RPM_HASH = "f89733a3ed8152f4e6ada89695243f0ec6c8e944d8de4e722ed0d7cc8d8d86a3d7594d960b21ff87e2e0e006b3e0671316580a4a0fa54c548a608064f0f65c6d"
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
