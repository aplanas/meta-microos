SUMMARY = "Library to access the EDB format"
DESCRIPTION = "Library to access the Extensible Storage Engine (ESE) Database File (EDB) \
format. ESEDB is used in may different applications like Windows Search, \
Windows Mail, Exchange, Active Directory, etc."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "libesedb1-20230318-1.2.aarch64.rpm"
RPM_HASH = "31addd963329875837405c86822fd31233c1869e5f45f2d360dbe46f57c422e84962ca0d1bd25b40b0f782f81955754fd4784e51720fd47bc683d835b2b267a3"

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
