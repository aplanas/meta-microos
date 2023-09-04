SUMMARY = "Library and tools to access the Windows Event Log (EVT) format"
DESCRIPTION = "libevt is a library and tools to access the Windows Event Log \
(EVT) format. \
For the Windows XML Event Log (EVTX) format, see libevtx."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221022"

RPM_NAME = "python310-libevt-20221022-4.1.aarch64.rpm"
RPM_HASH = "ff79ea5a739ec1b46702ae022a931df4fa3247a3450e259418ded1d65c382eafdc36c3da6e88b547b3329d0f3e4783da0dd2f1bcc66eac24f598207b5db22e2b"

RPROVIDES:${PN} += "python310-libevt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libevt.so.1 \
python-abi"

inherit rpm
