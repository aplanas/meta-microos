SUMMARY = "Library and tools to access the Windows Event Log (EVT) format"
DESCRIPTION = "libevt is a library and tools to access the Windows Event Log \
(EVT) format. \
For the Windows XML Event Log (EVTX) format, see libevtx."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221022"

RPM_NAME = "python310-libevt-20221022-3.9.aarch64.rpm"
RPM_HASH = "132b590ebaa8aa38a1080cdfcfaae0d9cba4eec6d08ed47676f03a3ce947065ed437d34e05879ebf1a083f3b115e744fc90dce2931ef7d6b3059556f7d3c4df0"

RPROVIDES:${PN} += "python3-libevt \
python310-libevt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libevt.so.1 \
python-abi"

inherit rpm
