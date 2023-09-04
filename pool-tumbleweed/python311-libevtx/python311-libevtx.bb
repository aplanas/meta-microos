SUMMARY = "Library and tools to access the Windows XML Event Log (EVTX) format"
DESCRIPTION = "Library and tools to access the Windows XML Event Log (EVTX) format. \
For the Windows pre-XML Event Log (EVT) format, see libevt."
LICENSE = "GFDL-1.3-only & LGPL-3.0-or-later"

PV = "20221101"

RPM_NAME = "python311-libevtx-20221101-4.1.aarch64.rpm"
RPM_HASH = "b18ab3bdf60ce4d8dfbd961afd93ac82584c4ec981bfc336a21e00c1c77023cafadec18ab0cd59215994ac02f2bb5d4ff66616e5dab9ef3c4a555fa5d20e8353"

RPROVIDES:${PN} += "python3-libevtx \
python311-libevtx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libevtx.so.1 \
python-abi"

inherit rpm
