SUMMARY = "GTK Widgets for Viewing EXIF Information"
DESCRIPTION = "This library contains GTK widgets for viewing EXIF information within \
JPEG images created by some digital cameras."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "libexif-gtk-0.5.0-1.13.aarch64.rpm"
RPM_HASH = "599f3f122509d15d4239f10ef3247cf8f3943cfb5f2b523ca6a8cf6415aeed55fe5369f293aabbee456ecbe61c2192bd9243b13bade37bd7ba0be184a679c88e"

RPROVIDES:${PN} += "libexif-gtk"

RDEPENDS:${PN} += "libexif-gtk5"

inherit rpm
