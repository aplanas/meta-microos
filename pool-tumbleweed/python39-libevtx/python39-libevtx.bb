SUMMARY = "Library and tools to access the Windows XML Event Log (EVTX) format"
DESCRIPTION = "Library and tools to access the Windows XML Event Log (EVTX) format. \
For the Windows pre-XML Event Log (EVT) format, see libevt."
LICENSE = "GFDL-1.3-only & LGPL-3.0-or-later"

PV = "20221101"

RPM_NAME = "python39-libevtx-20221101-4.1.aarch64.rpm"
RPM_HASH = "85551832a27c2e3affba1273c9812fa6946b59e7574a4f12b458095307850acc24028b151996fa31f410836a3f0a31233b830b1f757ebd3129eccfadec2768ca"

RPROVIDES:${PN} += "python39-libevtx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libevtx.so.1 \
python-abi"

inherit rpm
