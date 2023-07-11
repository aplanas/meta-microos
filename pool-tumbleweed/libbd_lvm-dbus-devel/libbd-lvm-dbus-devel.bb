SUMMARY = "Development files for the libblockdev-lvm-dbus plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_lvm-dbus plugin/library."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_lvm-dbus-devel-2.28-1.6.aarch64.rpm"
RPM_HASH = "93b606a7e8816aa41384b36db78f67bd3199a19e349795dacda69639ebc1a04d4a4824e40018d0c7c924120fc4096f3fcfa69e5fe88f9f5b448d0f9e1fe33c5e"

RPROVIDES:${PN} += "libbd-lvm-dbus-devel \
libblockdev-lvm-dbus-devel"

RDEPENDS:${PN} += "glib2-devel \
libbd-lvm-dbus2 \
libbd-lvm-devel \
libbd-utils-devel"

inherit rpm
