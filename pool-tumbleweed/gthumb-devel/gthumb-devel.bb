SUMMARY = "An Image Viewer and Browser for GNOME - Development Files"
DESCRIPTION = "gThumb lets you browse your hard disk, showing you thumbnails of image \
files. It also lets you view single files (including GIF animations), \
add comments to images, organize images in catalogs, print images, view \
slide shows, set your desktop background, and more."
LICENSE = "GPL-2.0-or-later"

PV = "3.12.2"

RPM_NAME = "gthumb-devel-3.12.2-4.1.aarch64.rpm"
RPM_HASH = "f989c3e1a1fc0553b53ae75775c672e5fd63fffae0f3238c6b2898ae69b7d832033c9da65f36c0d889ddf8c98b027dc2fba8d70730e5c3bdd3cd788e2b7c807f"

RPROVIDES:${PN} += "gthumb-devel \
pkgconfig-gthumb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gthumb \
pkgconfig-gtk+-3.0"

inherit rpm
