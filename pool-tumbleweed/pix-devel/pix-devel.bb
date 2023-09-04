SUMMARY = "Image viewer and browser utility -- Development Files"
DESCRIPTION = "pix lets you browse your hard disk, showing you thumbnails of \
image files. \
It also lets you view single files (including GIF animations), add \
comments to images, organise images in catalogs, print images, view \
slide shows, set your desktop background, and more."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.2"

RPM_NAME = "pix-devel-3.0.2-1.1.aarch64.rpm"
RPM_HASH = "392fad4e4e4aaea4956bf99ec8e24ede50680a0344349aa5f884b2e11ed71b9773fb97bad23760c6b8a5f89d28ba69875335307c1dddf246564a19ff86819a32"

RPROVIDES:${PN} += "pix-devel \
pkgconfig-pix"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pix \
pkgconfig-gtk+-3.0"

inherit rpm
