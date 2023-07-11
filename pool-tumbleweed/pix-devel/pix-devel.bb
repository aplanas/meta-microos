SUMMARY = "Image viewer and browser utility -- Development Files"
DESCRIPTION = "pix lets you browse your hard disk, showing you thumbnails of \
image files. \
It also lets you view single files (including GIF animations), add \
comments to images, organise images in catalogs, print images, view \
slide shows, set your desktop background, and more."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "pix-devel-2.8.0-1.12.aarch64.rpm"
RPM_HASH = "17e5d7a5dea5892b99b3d6e376e8a19bfb2a3acbdbc58439b9a89d3b7ffeb3819b998453cf4c83dfa1b89af8a235f7c7ddfbaf606295843d8f1e2809c9f4ce92"

RPROVIDES:${PN} += "pix-devel \
pkgconfig-pix-2.8"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pix \
pkgconfig-gtk+-3.0"

inherit rpm
