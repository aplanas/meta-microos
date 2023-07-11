SUMMARY = "Library and tools to access the Windows XML Event Log (EVTX) format"
DESCRIPTION = "Library and tools to access the Windows XML Event Log (EVTX) format. \
For the Windows pre-XML Event Log (EVT) format, see libevt."
LICENSE = "GFDL-1.3-only & LGPL-3.0-or-later"

PV = "20221101"

RPM_NAME = "python311-libevtx-20221101-3.11.aarch64.rpm"
RPM_HASH = "bc9d7dd6584dcbdec3d372109efd0c6de0e1901a9343dfb528baf1c58d8af6377421f088a77b991eba5b3e91450669bb34c3bc61a8441ae7a4e2fe4bb2e9fe3e"

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
