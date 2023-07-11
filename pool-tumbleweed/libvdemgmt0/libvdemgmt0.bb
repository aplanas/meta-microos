SUMMARY = "VDE management library"
DESCRIPTION = "This package contains a library to interact with vde_switch \
management console using pre-made unattended scripts."
LICENSE = "GPL-2.0"

PV = "2.3.2+svn587"

RPM_NAME = "libvdemgmt0-2.3.2+svn587-3.24.aarch64.rpm"
RPM_HASH = "2c54dc92678c61dc42a09a3ef608c7108884679f0a8e7e08eb83b25539090c7226b2e9ddcac4667027e00848612b5790f1a18eca29b532abfeb7b19c171328ad"

RPROVIDES:${PN} += "config-libvdemgmt0 \
libvdemgmt.so.0 \
libvdemgmt0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
