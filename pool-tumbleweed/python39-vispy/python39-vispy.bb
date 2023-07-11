SUMMARY = "Interactive visualization in Python"
DESCRIPTION = "Vispy is an interactive 2D/3D data visualization library. It leverages Graphics \
Processing Units through the OpenGL library to display large datasets."
LICENSE = "BSD-3-Clause"

PV = "0.12.2"

RPM_NAME = "python39-vispy-0.12.2-1.4.aarch64.rpm"
RPM_HASH = "e2babb1feff4d302bd31ace66d9bedf97776a829860cb18d96a996d30a50a585b8bde57b2d0b6257d1f30215bd6c27aff7987ae2ba1d2fedcb5a47ade8cdcaa6"

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
