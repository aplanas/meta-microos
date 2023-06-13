SUMMARY = "Interactive visualization in Python"
DESCRIPTION = "Vispy is an interactive 2D/3D data visualization library. It leverages Graphics \
Processing Units through the OpenGL library to display large datasets."
LICENSE = "BSD-3-Clause"

PV = "0.12.2"

RPM_NAME = "python310-vispy-0.12.2-1.2.aarch64.rpm"
RPM_HASH = "177e3dab92b7f0c6f3edc3e90fc9d47f02b9965767a354ddf57360c06ff38d2ca583c78c1a195d27727da1ec1300e2f8ac8bc6db4f09890837ed431c25666e70"

RPROVIDES:${PN} += "python3-vispy \
python3.10dist(vispy) \
python310-vispy \
python310-vispy(aarch-64) \
python3dist(vispy)"

RDEPENDS:${PN} += "fontconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python310-cassowary \
python310-decorator \
python310-freetype-py \
python310-husl \
python310-numpy \
python310-pypng \
python310-qt5"

inherit rpm
