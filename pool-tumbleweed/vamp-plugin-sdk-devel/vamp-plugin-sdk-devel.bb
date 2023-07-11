SUMMARY = "Development files for vamp-plugin-sdk"
DESCRIPTION = "The vamp-plugin-sdk-devel package contains documentation examples and \
header files for developing applications that use vamp-plugin-sdk."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "vamp-plugin-sdk-devel-2.10.0-1.13.aarch64.rpm"
RPM_HASH = "b8095500990527a716551c340652c9fc55e09f4d70ada1db4ba21c61d5d94c096bdf1bc913750162cb3d2ad163e8e343816592eaa851917e05b31b6ce238d0f7"

RPROVIDES:${PN} += "pkgconfig-vamp \
pkgconfig-vamp-hostsdk \
pkgconfig-vamp-sdk \
vamp-plugin-sdk-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvamp-hostsdk3 \
libvamp-sdk2 \
pkgconfig \
vamp-plugin-sdk"

inherit rpm
