SUMMARY = "Interactive visualization in Python"
DESCRIPTION = "Vispy is an interactive 2D/3D data visualization library. It leverages Graphics \
Processing Units through the OpenGL library to display large datasets."
LICENSE = "BSD-3-Clause"

PV = "0.13.0"

RPM_NAME = "python39-vispy-0.13.0-1.1.aarch64.rpm"
RPM_HASH = "535454ed68374f07c83e7b7f1b49564a345ace760a471da61fbaf72681965abab10745a0c612533f91f6538732d66238c6fb626ee48b3af0541d79af5d088478"

RPROVIDES:${PN} += "python3.9dist-vispy \
python39-vispy \
python3dist-vispy"

RDEPENDS:${PN} += "fontconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-cassowary \
python39-decorator \
python39-freetype-py \
python39-husl \
python39-numpy \
python39-pypng \
python39-qt5"

inherit rpm
