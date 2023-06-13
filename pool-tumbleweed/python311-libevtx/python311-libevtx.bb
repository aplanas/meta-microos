SUMMARY = "Library and tools to access the Windows XML Event Log (EVTX) format"
DESCRIPTION = "Library and tools to access the Windows XML Event Log (EVTX) format. \
For the Windows pre-XML Event Log (EVT) format, see libevt."
LICENSE = "GFDL-1.3-only & LGPL-3.0-or-later"

PV = "20221101"

RPM_NAME = "python311-libevtx-20221101-3.10.aarch64.rpm"
RPM_HASH = "5b109d1e1439b677545e3c08586f1babe9ee958d57bf78f807fdea39a16e7bcd33510cad65fb4f44813778223f1ac9965476d7170c56729bd40fd19f6bd68898"

RPROVIDES:${PN} += "python311-libevtx \
python311-libevtx(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6()(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libevtx.so.1()(64bit) \
libevtx.so.1(V_20221101)(64bit) \
python(abi)"

inherit rpm
