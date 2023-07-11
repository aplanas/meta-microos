SUMMARY = "Library and tools to access the Windows Event Log (EVT) format"
DESCRIPTION = "libevt is a library and tools to access the Windows Event Log \
(EVT) format. \
For the Windows XML Event Log (EVTX) format, see libevtx."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221022"

RPM_NAME = "python39-libevt-20221022-3.11.aarch64.rpm"
RPM_HASH = "b40a90c2ed2b74b3569adc989a7ca4730630df45fce3285453e8f8555aa317b7ad784ec0274138c6f06c90f151b8ebe7ee5e45d5ff2054c945b9d7a98d4984f0"

RPROVIDES:${PN} += "python39-libevt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libevt.so.1 \
python-abi"

inherit rpm
