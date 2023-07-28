SUMMARY = "An Image Viewer and Browser for GNOME - Development Files"
DESCRIPTION = "gThumb lets you browse your hard disk, showing you thumbnails of image \
files. It also lets you view single files (including GIF animations), \
add comments to images, organize images in catalogs, print images, view \
slide shows, set your desktop background, and more."
LICENSE = "GPL-2.0-or-later"

PV = "3.12.2"

RPM_NAME = "gthumb-devel-3.12.2-5.1.aarch64.rpm"
RPM_HASH = "c094aa6c7d4a36fd256de144ae41d6e98ec86fd06dc2370f07ea108793d8e517ec00215143f522c5cfc57db7209a123c380925c9cd98b31a7231ea1ae7eb7010"

RPROVIDES:${PN} += "gthumb-devel \
pkgconfig-gthumb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gthumb \
pkgconfig-gtk+-3.0"

inherit rpm
