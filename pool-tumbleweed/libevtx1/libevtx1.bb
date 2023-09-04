SUMMARY = "Library to access the Windows XML Event Log (EVTX) format"
DESCRIPTION = "Library to access the Windows Event Log (EVT) format. \
For the Windows pre-XML Event Log (EVT) format, see libevt."
LICENSE = "LGPL-3.0-or-later"

PV = "20221101"

RPM_NAME = "libevtx1-20221101-4.1.aarch64.rpm"
RPM_HASH = "f6782d0ee9bf5f22c8b1b5f851e7107778558890e565809a4590cfd7fac0de2035b14af10a1f44fc7ec6ff28b1d2adfc6a59ed67d19c30a34cdb2704523fbaf1"

RPROVIDES:${PN} += "libevtx.so.1 \
libevtx1"

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
libfwevt.so.1"

inherit rpm
