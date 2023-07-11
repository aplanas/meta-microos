SUMMARY = "Interactive visualization in Python"
DESCRIPTION = "Vispy is an interactive 2D/3D data visualization library. It leverages Graphics \
Processing Units through the OpenGL library to display large datasets."
LICENSE = "BSD-3-Clause"

PV = "0.12.2"

RPM_NAME = "python311-vispy-0.12.2-1.4.aarch64.rpm"
RPM_HASH = "bdd27394802353be4e24affc71abc26abe4f9df9da1ad64efb895a26942206bf157eef22b115606a563116645a74bb998715b9f148b5858beb3668c260a9e103"

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
