SUMMARY = "Interactive visualization in Python"
DESCRIPTION = "Vispy is an interactive 2D/3D data visualization library. It leverages Graphics \
Processing Units through the OpenGL library to display large datasets."
LICENSE = "BSD-3-Clause"

PV = "0.12.2"

RPM_NAME = "python310-vispy-0.12.2-1.4.aarch64.rpm"
RPM_HASH = "1a5ad00f262195eaeaf6dacf435085c402730366f40f63c0e323f2ad300e02480cd1ddc8073809c54c04f3b2909a5c4b1d4e2e0a48373e6df8b26e587911a98b"

RPROVIDES:${PN} += "python3.10dist-vispy \
python310-vispy \
python3dist-vispy"

RDEPENDS:${PN} += "fontconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-cassowary \
python310-decorator \
python310-freetype-py \
python310-husl \
python310-numpy \
python310-pypng \
python310-qt5"

inherit rpm
