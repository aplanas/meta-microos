SUMMARY = "Library to access the EDB format"
DESCRIPTION = "Library to access the Extensible Storage Engine (ESE) Database File (EDB) \
format. ESEDB is used in may different applications like Windows Search, \
Windows Mail, Exchange, Active Directory, etc."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "libesedb1-20230318-1.2.aarch64.rpm"
RPM_HASH = "31addd963329875837405c86822fd31233c1869e5f45f2d360dbe46f57c422e84962ca0d1bd25b40b0f782f81955754fd4784e51720fd47bc683d835b2b267a3"

RPROVIDES:${PN} += "libesedb.so.1()(64bit) \
libesedb.so.1(V_20230318)(64bit) \
libesedb1 \
libesedb1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6()(64bit) \
libcdata.so.1()(64bit) \
libcdata.so.1(V_20230108)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libcnotify.so.1()(64bit) \
libcnotify.so.1(V_20220108)(64bit) \
libfcache.so.1()(64bit) \
libfcache.so.1(V_20230115)(64bit) \
libfdata.so.1()(64bit) \
libfdata.so.1(V_20230319)(64bit) \
libfvalue.so.1()(64bit) \
libfvalue.so.1(V_20220120)(64bit) \
libfwnt.so.1()(64bit) \
libfwnt.so.1(V_20220922)(64bit) \
libuna.so.1()(64bit) \
libuna.so.1(V_20220611)(64bit)"

inherit rpm
