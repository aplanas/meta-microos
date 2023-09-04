SUMMARY = "Library to access the Windows Event Log (EVT) format"
DESCRIPTION = "libevt is a library and tools to access the Windows Event Log \
(EVT) format. \
For the Windows XML Event Log (EVTX) format, see libevtx."
LICENSE = "LGPL-3.0-or-later"

PV = "20221022"

RPM_NAME = "libevt1-20221022-4.1.aarch64.rpm"
RPM_HASH = "84aaaaa51b7d9e60bc6b6289392b099215d00117835e2bdf98312b56e765e545c26f882167ecbe4db7a581916221a062fc517b022e8e15af99544f63bd43b1ce"

RPROVIDES:${PN} += "libevt.so.1 \
libevt1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libfwnt.so.1 \
libuna.so.1"

inherit rpm
