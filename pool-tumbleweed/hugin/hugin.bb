SUMMARY = "Toolchain for Stitching of Images and Creating Panoramas"
DESCRIPTION = "Hugin can be used to stitch multiple images together. The resulting \
image can span 360 degrees. Another common use is the creation of very \
high resolution pictures by combining multiple images. \
 \
Other tools in this package can correct lens distortion, vignetting and \
chromatic abberation, create HDR images, provide automatic feature \
detection and extraction of key points."
LICENSE = "GPL-2.0-or-later"

PV = "2022.0.0"

RPM_NAME = "hugin-2022.0.0-1.8.aarch64.rpm"
RPM_HASH = "a9d64be4a159a85a57d471a72aee00a2a7334a4efa1cacf2b3cae7c3dfbb5a1d245c343c89597fb3fa943f411eebea7dbdeed15c9b60eb7bbdafce671cac7c9d"

RPROVIDES:${PN} += "hugin \
libceleste.so.0.0 \
libhuginbase.so.0.0 \
libhuginbasewx.so.0.0 \
libicpfindlib.so.0.0 \
liblocalfeatures.so.0.0"

RDEPENDS:${PN} += "enblend-enfuse \
ld-linux-aarch64.so.1 \
libGLEW.so.2.2 \
libGLU.so.1 \
libGLX.so.0 \
libImath-3-1.so.29 \
libOpenEXR-3-1.so.30 \
libOpenGL.so.0 \
libX11.so.6 \
libblas.so.3 \
libboost-filesystem.so.1.82.0 \
libc.so.6 \
libexiv2.so.27 \
libfftw3.so.3 \
libgcc-s.so.1 \
libgomp.so.1 \
liblapack.so.3 \
liblcms2.so.2 \
liblz4.so.1 \
libm.so.6 \
libpano13.so.3 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtiff.so.6 \
libvigraimpex.so.11 \
libwx-baseu-net-suse.so.9.0.0 \
libwx-baseu-suse.so.9.0.0 \
libwx-baseu-xml-suse.so.9.0.0 \
libwx-gtk3u-aui-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0 \
libwx-gtk3u-gl-suse.so.9.0.0 \
libwx-gtk3u-html-suse.so.9.0.0 \
libwx-gtk3u-qa-suse.so.9.0.0 \
libwx-gtk3u-xrc-suse.so.9.0.0 \
make"

inherit rpm
