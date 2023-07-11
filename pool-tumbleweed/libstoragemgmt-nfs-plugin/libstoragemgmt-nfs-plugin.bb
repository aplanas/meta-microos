SUMMARY = "Files for nfs support for libstoragemgmt"
DESCRIPTION = "The libstoragemgmt-nfs-plugin package contains the plugin for nfs based storage."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.8"

RPM_NAME = "libstoragemgmt-nfs-plugin-1.9.8-1.2.aarch64.rpm"
RPM_HASH = "bd7cf5511c45323b44863605962cfc8fd7b24547136eddca7d21c8cbf40f5fbd1a9ba3c88db74daf2851e654d3550d3d49f63cd2bc83234941b12995910f00ea"

RPROVIDES:${PN} += "config-libstoragemgmt-nfs-plugin \
libstoragemgmt-nfs-plugin"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstoragemgmt \
python-abi \
python3-libstoragemgmt"

inherit rpm
