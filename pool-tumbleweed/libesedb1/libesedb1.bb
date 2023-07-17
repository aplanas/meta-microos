SUMMARY = "Library to access the EDB format"
DESCRIPTION = "Library to access the Extensible Storage Engine (ESE) Database File (EDB) \
format. ESEDB is used in may different applications like Windows Search, \
Windows Mail, Exchange, Active Directory, etc."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "libesedb1-20230318-1.6.aarch64.rpm"
RPM_HASH = "f1e4c9ec10471b86c98637905b6ae6402c0fbb832dee486fd0c6161bb2cc178c7d25ed6a40b86741993063467f01f4f0af3cb919d610cebd6cae7db7de0caa41"

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
