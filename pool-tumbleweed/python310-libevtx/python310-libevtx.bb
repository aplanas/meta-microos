SUMMARY = "Library and tools to access the Windows XML Event Log (EVTX) format"
DESCRIPTION = "Library and tools to access the Windows XML Event Log (EVTX) format. \
For the Windows pre-XML Event Log (EVT) format, see libevt."
LICENSE = "GFDL-1.3-only & LGPL-3.0-or-later"

PV = "20221101"

RPM_NAME = "python310-libevtx-20221101-4.1.aarch64.rpm"
RPM_HASH = "3df98934afd3eefb8b62e34b56468905355eeb75c0db3fdbff426a59f6091bac5bdf223660a5e65a810566522463c7a687c76bf78859e65eaa95a702036fc66a"

RPROVIDES:${PN} += "python310-libevtx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libevtx.so.1 \
python-abi"

inherit rpm
