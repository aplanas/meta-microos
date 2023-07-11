SUMMARY = "Library to identify wacom tablets -- Development Files"
DESCRIPTION = "libwacom is a library to identify wacom tablets and their model-specific \
features. It provides easy access to information such as 'is this a \
built-in on-screen tablet', 'what is the size of this model', etc."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "libwacom-devel-2.5.0-1.4.aarch64.rpm"
RPM_HASH = "f61bac5307e7855cc9a7b9c37a1657965af074c258e6eba3380ef9e81bb269d8d89173e45961f0f4e95d45596d63d4d4b8ae29ff8f2f482b7d1cd730adf62b7e"

RPROVIDES:${PN} += "libwacom-devel \
pkgconfig-libwacom"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwacom9 \
pkgconfig-glib-2.0 \
pkgconfig-gudev-1.0"

inherit rpm
