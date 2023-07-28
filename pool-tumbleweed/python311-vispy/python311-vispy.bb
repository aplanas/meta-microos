SUMMARY = "Interactive visualization in Python"
DESCRIPTION = "Vispy is an interactive 2D/3D data visualization library. It leverages Graphics \
Processing Units through the OpenGL library to display large datasets."
LICENSE = "BSD-3-Clause"

PV = "0.13.0"

RPM_NAME = "python311-vispy-0.13.0-1.1.aarch64.rpm"
RPM_HASH = "c08cc90ce9e00afadd8e316a845364d5f1e281f7cf3d787156ba7da072f9ed6e2033cb8e3e2e4098f734542ffa78c4f9332f47af411e7307f47d911a9a16297b"

RPROVIDES:${PN} += "python3-vispy \
python3.11dist-vispy \
python311-vispy \
python3dist-vispy"

RDEPENDS:${PN} += "fontconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-cassowary \
python311-decorator \
python311-freetype-py \
python311-husl \
python311-numpy \
python311-pypng \
python311-qt5"

inherit rpm
