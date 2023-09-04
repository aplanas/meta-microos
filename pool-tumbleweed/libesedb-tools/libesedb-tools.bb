SUMMARY = "Tools to access the EDB format"
DESCRIPTION = "Tools to access the Extensible Storage Engine (ESE) Database File (EDB) format. \
ESEDB is used in may different applications like Windows Search, Windows Mail, \
Exchange, Active Directory, etc."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "libesedb-tools-20230318-2.1.aarch64.rpm"
RPM_HASH = "e4e91b81a28a072e16267f47d0a32c8b98e7ef6a409b1ef05c6ef021d4cc227116765af31327e39d08ee8b1c13c20f9abbd8342ffda75d8ffa9958ef056e5a6f"

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
