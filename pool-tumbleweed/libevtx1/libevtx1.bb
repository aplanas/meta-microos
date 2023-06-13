SUMMARY = "Library to access the Windows XML Event Log (EVTX) format"
DESCRIPTION = "Library to access the Windows Event Log (EVT) format. \
For the Windows pre-XML Event Log (EVT) format, see libevt."
LICENSE = "LGPL-3.0-or-later"

PV = "20221101"

RPM_NAME = "libevtx1-20221101-3.10.aarch64.rpm"
RPM_HASH = "656ba2de90d0a416e73b6b4acc810b06a1b2086b62fb9d9afc0cdd5aa6fd9bc0d3968b332149722e84492eab5d872a4a058ff063ce15b39fe4f8bee1af4632bd"

RPROVIDES:${PN} += "libevtx.so.1()(64bit) \
libevtx.so.1(V_20221101)(64bit) \
libevtx1 \
libevtx1(aarch-64)"

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
libfwevt.so.1()(64bit) \
libfwevt.so.1(V_20230410)(64bit)"

inherit rpm
