SUMMARY = "Library to access the Windows Event Log (EVT) format"
DESCRIPTION = "libevt is a library and tools to access the Windows Event Log \
(EVT) format. \
For the Windows XML Event Log (EVTX) format, see libevtx."
LICENSE = "LGPL-3.0-or-later"

PV = "20221022"

RPM_NAME = "libevt1-20221022-3.9.aarch64.rpm"
RPM_HASH = "5eef1fe367158ddf6e6cd0d5fb91c91d1042a9755be306cd3c178f5e20b9e37a73356d80647225a01f4a71ab947e880f32cb7e13cf750cc8007e53e24f6f5c1c"

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
