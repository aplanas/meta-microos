SUMMARY = "Library and tools to access the Windows XML Event Log (EVTX) format"
DESCRIPTION = "Library and tools to access the Windows XML Event Log (EVTX) format. \
For the Windows pre-XML Event Log (EVT) format, see libevt."
LICENSE = "GFDL-1.3-only & LGPL-3.0-or-later"

PV = "20221101"

RPM_NAME = "python310-libevtx-20221101-3.11.aarch64.rpm"
RPM_HASH = "415059690c103fa5e60a9882485576c2b7342989c58ac1bd31be3d410198e2327818f0e6ff3f6d9dcb2acf27e1926585a9c6ea0da48f244c5c2a869bd024d3f0"

RPROVIDES:${PN} += "python310-libevtx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libevtx.so.1 \
python-abi"

inherit rpm
