SUMMARY = "Library and tools to access the Windows XML Event Log (EVTX) format"
DESCRIPTION = "Library and tools to access the Windows XML Event Log (EVTX) format. \
For the Windows pre-XML Event Log (EVT) format, see libevt."
LICENSE = "GFDL-1.3-only & LGPL-3.0-or-later"

PV = "20221101"

RPM_NAME = "python39-libevtx-20221101-3.11.aarch64.rpm"
RPM_HASH = "84250d5b94433a43eee37c649dbd52f770e85db152d347da3f43d2a22be656eb9566c529112386de89bd976d312409447d731ec563fe88036d9a6ac523a946f0"

RPROVIDES:${PN} += "python39-libevtx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libevtx.so.1 \
python-abi"

inherit rpm
