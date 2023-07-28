SUMMARY = "Interactive visualization in Python"
DESCRIPTION = "Vispy is an interactive 2D/3D data visualization library. It leverages Graphics \
Processing Units through the OpenGL library to display large datasets."
LICENSE = "BSD-3-Clause"

PV = "0.13.0"

RPM_NAME = "python310-vispy-0.13.0-1.1.aarch64.rpm"
RPM_HASH = "0e97ee729070ff8ee3d60ce7e1d77c75fbd2213fd18b6639b59fa87f21552828e48dd702f01543cfbf17954606b60cb4e3f9cc004c69d795f862adc2c92cf013"

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
