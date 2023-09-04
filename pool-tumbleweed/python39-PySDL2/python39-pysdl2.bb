SUMMARY = "Python ctypes wrapper around SDL2"
DESCRIPTION = "PySDL2 is a pure Python wrapper around the SDL2, SDL2_mixer, SDL2_image, \
SDL2_ttf, and SDL2_gfx libraries. Instead of relying on C code, it uses \
the built-in ctypes module to interface with SDL2, and provides simple \
Python classes and wrappers for common SDL2 functionality."
LICENSE = "SUSE-Public-Domain"

PV = "0.9.16"

RPM_NAME = "python39-PySDL2-0.9.16-2.1.noarch.rpm"
RPM_HASH = "14b4d9ff6868b08e1a31fda5f6abb9b2d3368a8dfb2eca253ff58f6118bcde773493cc447762f823b92fe677b9dd06cd6f04e9b628ba52df2103a2087716da25"
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
