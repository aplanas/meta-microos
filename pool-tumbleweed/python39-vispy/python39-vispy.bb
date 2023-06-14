SUMMARY = "Interactive visualization in Python"
DESCRIPTION = "Vispy is an interactive 2D/3D data visualization library. It leverages Graphics \
Processing Units through the OpenGL library to display large datasets."
LICENSE = "BSD-3-Clause"

PV = "0.12.2"

RPM_NAME = "python39-vispy-0.12.2-1.2.aarch64.rpm"
RPM_HASH = "172703db7877e1d97db08429448b9a30bae3178618e159ae1aa3ef33e2f1b52edf64ca0707ed4f35e72c746365e132eae937b1ae23f1bb500792f87fd9da53d6"

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
