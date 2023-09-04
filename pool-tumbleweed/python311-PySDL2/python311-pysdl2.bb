SUMMARY = "Python ctypes wrapper around SDL2"
DESCRIPTION = "PySDL2 is a pure Python wrapper around the SDL2, SDL2_mixer, SDL2_image, \
SDL2_ttf, and SDL2_gfx libraries. Instead of relying on C code, it uses \
the built-in ctypes module to interface with SDL2, and provides simple \
Python classes and wrappers for common SDL2 functionality."
LICENSE = "SUSE-Public-Domain"

PV = "0.9.16"

RPM_NAME = "python311-PySDL2-0.9.16-2.1.noarch.rpm"
RPM_HASH = "a870e2eaa5f5fb13af4dfac5344046339538f7a75740edd91b91b4a2068af4218f39105243615255ce874a4368870fc0a5114db5b022c700dc675a13babe4dc7"
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
