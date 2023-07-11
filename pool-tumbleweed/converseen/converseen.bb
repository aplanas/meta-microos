SUMMARY = "Batch Image Conversion Tool"
DESCRIPTION = "Converseen is a batch image conversion tool. Converseen allows you \
to convert images in more than 100 different formats. \
 \
With converseen you can: \
- Carry out a single or a multiple conversion. \
- Resize one or more images. \
- Compress images for your web pages. \
- Rotate and flip images. \
- Rename a bunch of images using a progressive number or a prefix/suffix. \
- Selecting a resampling filter to resize images."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.11.1"

RPM_NAME = "converseen-0.9.11.1-1.2.aarch64.rpm"
RPM_HASH = "2a91d1e554d20495d0c408a37eb2d9e5c427cca57a6a97c874f0a4e5d6f0be077603dc745ff4f013d69189292de87a46ff2b813f7b52866c9c73cd79bb854371"

RPROVIDES:${PN} += "converseen"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libMagick++-7.Q16HDRI.so.5 \
libMagickCore-7.Q16HDRI.so.10 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
