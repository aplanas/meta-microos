SUMMARY = "Library to access the EDB format"
DESCRIPTION = "Library to access the Extensible Storage Engine (ESE) Database File (EDB) \
format. ESEDB is used in may different applications like Windows Search, \
Windows Mail, Exchange, Active Directory, etc."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "libesedb1-20230318-2.1.aarch64.rpm"
RPM_HASH = "1b7c4c1c252cdda6ce18bc6ce23937fdfdcdb2f730586a6d54c0175694a6bd46d910ebc780bda2ca013245026bfd35223137fd1f3083270cf4e4491f52c4a350"

RPROVIDES:${PN} += "libesedb.so.1 \
libesedb1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libfvalue.so.1 \
libfwnt.so.1 \
libuna.so.1"

inherit rpm
