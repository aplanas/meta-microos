SUMMARY = "Library and tools to access the Windows Event Log (EVT) format"
DESCRIPTION = "libevt is a library and tools to access the Windows Event Log \
(EVT) format. \
For the Windows XML Event Log (EVTX) format, see libevtx."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221022"

RPM_NAME = "python39-libevt-20221022-4.1.aarch64.rpm"
RPM_HASH = "60b7a038948e20d9041ef892a4bf36ef26bb38e19443abfcb24c997a914520468570478ad10c4cb118e82c3706197b7ca60a5b036ede69418500f6d8f87b534e"

RPROVIDES:${PN} += "python39-libevt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libevt.so.1 \
python-abi"

inherit rpm
