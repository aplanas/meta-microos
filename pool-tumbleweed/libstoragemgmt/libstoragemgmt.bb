SUMMARY = "Storage array management library"
DESCRIPTION = "The libStorageMgmt library will provide a vendor agnostic open source storage \
application programming interface (API) that will allow management of storage \
arrays.  The library includes a command line interface for interactive use and \
scripting (command lsmcli).  The library also has a daemon that is used for \
executing plug-ins in a separate process (lsmd)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.8"

RPM_NAME = "libstoragemgmt-1.9.8-1.2.aarch64.rpm"
RPM_HASH = "b2dc0d090b6de2e2e2a7d0b47344a60f326c26b94e207769d2faef4904ce17b4b5424df84210340cd02374c52f34367dd25f1e85da65216b4311f74fbcc5ff07"

RPROVIDES:${PN} += "config-libstoragemgmt \
group-libstoragemgmt \
libstoragemgmt \
user-libstoragemgmt"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libconfig.so.11 \
libsqlite3.so.0 \
libstoragemgmt.so.1 \
python3-libstoragemgmt \
python3-six \
systemd \
sysuser-shadow"

inherit rpm
