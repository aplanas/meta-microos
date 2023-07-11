SUMMARY = "Tools to access the EDB format"
DESCRIPTION = "Tools to access the Extensible Storage Engine (ESE) Database File (EDB) format. \
ESEDB is used in may different applications like Windows Search, Windows Mail, \
Exchange, Active Directory, etc."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "libesedb-tools-20230318-1.5.aarch64.rpm"
RPM_HASH = "96c33376c6f34340a9673d62e5573db079df2b29cf4ba6a5e8cc16f7a51c7043ead1aabf95a3ec256e7fae8e215d4c93789decfc00ecdf0c0cb984dbb473845b"

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
