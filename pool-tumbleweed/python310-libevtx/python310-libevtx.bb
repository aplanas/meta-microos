SUMMARY = "Library and tools to access the Windows XML Event Log (EVTX) format"
DESCRIPTION = "Library and tools to access the Windows XML Event Log (EVTX) format. \
For the Windows pre-XML Event Log (EVT) format, see libevt."
LICENSE = "GFDL-1.3-only & LGPL-3.0-or-later"

PV = "20221101"

RPM_NAME = "python310-libevtx-20221101-3.10.aarch64.rpm"
RPM_HASH = "943a39861c4e561c99991e87726163fb3b9b0eca27807135e1c91b50f0b3a56c25f55f6188ea3d9ce29da4a5e8efe950e1b4389b059dc2cd6b4eae33b7ca5e62"

RPROVIDES:${PN} += "python3-libevtx \
python310-libevtx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libevtx.so.1 \
python-abi"

inherit rpm
