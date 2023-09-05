SUMMARY = "An Image Viewer and Browser for GNOME - Development Files"
DESCRIPTION = "gThumb lets you browse your hard disk, showing you thumbnails of image \
files. It also lets you view single files (including GIF animations), \
add comments to images, organize images in catalogs, print images, view \
slide shows, set your desktop background, and more."
LICENSE = "GPL-2.0-or-later"

PV = "3.12.3"

RPM_NAME = "gthumb-devel-3.12.3-1.1.aarch64.rpm"
RPM_HASH = "d3b97a81fc281107649d15a54a36d9b8c2c7cb63b270e8a9198723b1fcc08df20bb031603c9a7f20c0aa5e772fc36d29ce8d0a2a96eb173f418b98e6c0162b68"

RPROVIDES:${PN} += "gthumb-devel \
pkgconfig-gthumb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gthumb \
pkgconfig-gtk+-3.0"

inherit rpm
