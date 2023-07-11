SUMMARY = "Library to access the Windows Event Log (EVT) format"
DESCRIPTION = "libevt is a library and tools to access the Windows Event Log \
(EVT) format. \
For the Windows XML Event Log (EVTX) format, see libevtx."
LICENSE = "LGPL-3.0-or-later"

PV = "20221022"

RPM_NAME = "libevt1-20221022-3.11.aarch64.rpm"
RPM_HASH = "4aee1ea7a7ad0963f20abce48766034c4f2e365097f8086601e39ea93c2501eabbe8a1bc55e99c64c097ab11502d5bd09ac145a4be011e5eb428d585fb63c01c"

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
