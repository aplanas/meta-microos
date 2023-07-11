SUMMARY = "Library to access the Windows XML Event Log (EVTX) format"
DESCRIPTION = "Library to access the Windows Event Log (EVT) format. \
For the Windows pre-XML Event Log (EVT) format, see libevt."
LICENSE = "LGPL-3.0-or-later"

PV = "20221101"

RPM_NAME = "libevtx1-20221101-3.11.aarch64.rpm"
RPM_HASH = "299d88ebc6c52bdb61c3499e2bab04e7e5f721851fb960d0150d6601c14bca22a4007d4ae41f3354c6447675490461c112d47365f62dc4faea682f7ff955592b"

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
