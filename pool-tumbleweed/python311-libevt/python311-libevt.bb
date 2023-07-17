SUMMARY = "Library and tools to access the Windows Event Log (EVT) format"
DESCRIPTION = "libevt is a library and tools to access the Windows Event Log \
(EVT) format. \
For the Windows XML Event Log (EVTX) format, see libevtx."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221022"

RPM_NAME = "python311-libevt-20221022-3.12.aarch64.rpm"
RPM_HASH = "3fd3ad0d43732b23faa3613bd800995bc664af9444715c9f028136684aa96c77301211f86315c2acf582eb26cc829f8ebda684f155c5637e32f2440b6950d0c6"

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
