SUMMARY = "Library and tools to access the Windows Event Log (EVT) format"
DESCRIPTION = "libevt is a library and tools to access the Windows Event Log \
(EVT) format. \
For the Windows XML Event Log (EVTX) format, see libevtx."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221022"

RPM_NAME = "python39-libevt-20221022-3.12.aarch64.rpm"
RPM_HASH = "186ef346fc5f808360d17a55b80d7d98bc953e7a1b544f8b881206c8bb1bcfa1b41719e8398d49cdd3cfe69ef3027cc65f6e632430fc27616c22a5ab9bb805e8"

RPROVIDES:${PN} += "python39-libevt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libevt.so.1 \
python-abi"

inherit rpm
