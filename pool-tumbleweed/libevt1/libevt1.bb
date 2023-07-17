SUMMARY = "Library to access the Windows Event Log (EVT) format"
DESCRIPTION = "libevt is a library and tools to access the Windows Event Log \
(EVT) format. \
For the Windows XML Event Log (EVTX) format, see libevtx."
LICENSE = "LGPL-3.0-or-later"

PV = "20221022"

RPM_NAME = "libevt1-20221022-3.12.aarch64.rpm"
RPM_HASH = "c983e93f00b5bc7eb134ffa12153b46a92262399b238a66d0948f8cfe22681432a63524bd32b795fd6aacbbed5c5b3d65cd9b636faedcdbc2ec2121ccc85c5e9"

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
