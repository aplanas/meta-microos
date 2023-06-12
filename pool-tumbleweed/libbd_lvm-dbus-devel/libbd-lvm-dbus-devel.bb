SUMMARY = "Development files for the libblockdev-lvm-dbus plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_lvm-dbus plugin/library."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_lvm-dbus-devel-2.28-1.4.aarch64.rpm"
RPM_HASH = "0a1971deb2347e779ec8546368150ff33c931d5caae6e2052f6c7a32cbaa3a605a1cfdd5e02b04a18e955c829ee159403499f6177ba6388b66086d7f6af16b6b"

RPROVIDES:${PN} += "libbd_lvm-dbus-devel \
libbd_lvm-dbus-devel(aarch-64) \
libblockdev-lvm-dbus-devel"
RDEPENDS:${PN} += "glib2-devel \
libbd_lvm-dbus2 \
libbd_lvm-devel \
libbd_utils-devel"

inherit rpm
