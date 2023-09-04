SUMMARY = "Library and tools to access the Windows Event Log (EVT) format"
DESCRIPTION = "libevt is a library and tools to access the Windows Event Log \
(EVT) format. \
For the Windows XML Event Log (EVTX) format, see libevtx."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221022"

RPM_NAME = "python311-libevt-20221022-4.1.aarch64.rpm"
RPM_HASH = "484197e1281a204e0d440db36184effa81c20bf7235354b913c0a53ce674cd3f26acc590e093cc72fded4ac7e86822ebbdd677a8b8949af208a76eb2ecb51d74"

RPROVIDES:${PN} += "python3-libevt \
python311-libevt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libevt.so.1 \
python-abi"

inherit rpm
