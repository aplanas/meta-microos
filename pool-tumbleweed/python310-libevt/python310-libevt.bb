SUMMARY = "Library and tools to access the Windows Event Log (EVT) format"
DESCRIPTION = "libevt is a library and tools to access the Windows Event Log \
(EVT) format. \
For the Windows XML Event Log (EVTX) format, see libevtx."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221022"

RPM_NAME = "python310-libevt-20221022-3.11.aarch64.rpm"
RPM_HASH = "4cda70c30613aac260a358cc012fdff7627ee0261908e9fff12ee9d45f0f12f1668be8c03adc3f7785354d0c93c00406090a35ad0e25f4100b2c443da560c28d"

RPROVIDES:${PN} += "python310-libevt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libevt.so.1 \
python-abi"

inherit rpm
