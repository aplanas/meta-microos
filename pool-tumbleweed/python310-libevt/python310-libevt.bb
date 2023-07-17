SUMMARY = "Library and tools to access the Windows Event Log (EVT) format"
DESCRIPTION = "libevt is a library and tools to access the Windows Event Log \
(EVT) format. \
For the Windows XML Event Log (EVTX) format, see libevtx."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221022"

RPM_NAME = "python310-libevt-20221022-3.12.aarch64.rpm"
RPM_HASH = "f3bfbe0110b94dedb15e4e48109ce3ebd576fe050907f93f8f8f067c45edc57d9445d880d50c06c5134f2b7c5a25e3ac043d4922e617482e1ec0f7b0abfc82b7"

RPROVIDES:${PN} += "python310-libevt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libevt.so.1 \
python-abi"

inherit rpm
