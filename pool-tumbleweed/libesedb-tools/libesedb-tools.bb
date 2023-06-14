SUMMARY = "Tools to access the EDB format"
DESCRIPTION = "Tools to access the Extensible Storage Engine (ESE) Database File (EDB) format. \
ESEDB is used in may different applications like Windows Search, Windows Mail, \
Exchange, Active Directory, etc."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "libesedb-tools-20230318-1.2.aarch64.rpm"
RPM_HASH = "c0ee7906a1737d725022087d5acb6f8772d70470c87dd222f20653bd91e74d7be78cde1c45e65bb440e4716cbde32fcf91103b367ee4eba01aa8965bf5104d0c"

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
