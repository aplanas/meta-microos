SUMMARY = "VDE management library"
DESCRIPTION = "This package contains a library to interact with vde_switch \
management console using pre-made unattended scripts."
LICENSE = "GPL-2.0"

PV = "2.3.2+svn587"

RPM_NAME = "libvdemgmt0-2.3.2+svn587-3.23.aarch64.rpm"
RPM_HASH = "0a1dbcf17cb23f17396a218e8b60e6cc2b8adcfca6223d64937bd51b3dfe3623db6622327dd13d41729da292780a52ac889b3c9b16b4f5899270d71c6fdb6d98"

RPROVIDES:${PN} += "config-libvdemgmt0 \
libvdemgmt.so.0 \
libvdemgmt0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
