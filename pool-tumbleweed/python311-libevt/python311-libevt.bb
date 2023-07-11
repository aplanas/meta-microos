SUMMARY = "Library and tools to access the Windows Event Log (EVT) format"
DESCRIPTION = "libevt is a library and tools to access the Windows Event Log \
(EVT) format. \
For the Windows XML Event Log (EVTX) format, see libevtx."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221022"

RPM_NAME = "python311-libevt-20221022-3.11.aarch64.rpm"
RPM_HASH = "f46bc6acafd73b0b26b2e181207f232a55974efa02bd0bc564ae298041eebe94194294a3f4c18f41a09256227440271bec31c0a9d68bc485b8f60286894ec959"

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
