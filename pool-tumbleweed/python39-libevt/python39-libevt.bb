SUMMARY = "Library and tools to access the Windows Event Log (EVT) format"
DESCRIPTION = "libevt is a library and tools to access the Windows Event Log \
(EVT) format. \
For the Windows XML Event Log (EVTX) format, see libevtx."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221022"

RPM_NAME = "python39-libevt-20221022-3.9.aarch64.rpm"
RPM_HASH = "a131a2aad2609c0eab0e6c0b3e633f132b156317f6840114a98205cdce636fda6ae9a49b8093c4d15e0d7f51ec819163148db9905fe48250a146eea764b741d6"

RPROVIDES:${PN} += "python39-libevt \
python39-libevt(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libevt.so.1()(64bit) \
libevt.so.1(V_20221022)(64bit) \
python(abi)"

inherit rpm
