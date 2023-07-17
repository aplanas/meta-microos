SUMMARY = "Tools to access the EDB format"
DESCRIPTION = "Tools to access the Extensible Storage Engine (ESE) Database File (EDB) format. \
ESEDB is used in may different applications like Windows Search, Windows Mail, \
Exchange, Active Directory, etc."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "libesedb-tools-20230318-1.6.aarch64.rpm"
RPM_HASH = "d802e92eb70ce61b58c367f01e367ed8bd164fde63304bbdb52f1b6a0362231cad62c9f06941f3e2ef0e232334a628b803a40c397ffbbec428fa32cc1a29c3eb"

RPROVIDES:${PN} += "libesedb-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libcfile.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcpath.so.1 \
libesedb.so.1 \
libfdatetime.so.1 \
libfguid.so.1 \
libfwnt.so.1 \
libuna.so.1"

inherit rpm
