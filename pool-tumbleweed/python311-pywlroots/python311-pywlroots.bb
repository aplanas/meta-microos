SUMMARY = "Python binding to the wlroots library using cffi"
DESCRIPTION = "Python binding to the wlroots library using cffi."
LICENSE = "NCSA"

PV = "0.16.4"

RPM_NAME = "python311-pywlroots-0.16.4-1.1.aarch64.rpm"
RPM_HASH = "762832f0f46f142a7596fb41856df79c3e00bb10c0825d6db9599267833c2b8cdbe271a657c71c48d9818c859ea7ba2d5debc30be93fb21ebc63865356c01900"

RPROVIDES:${PN} += "python3.11dist(pywlroots) \
python311-pywlroots \
python311-pywlroots(aarch-64) \
python3dist(pywlroots)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libwlroots.so.11()(64bit) \
python(abi) \
python311-pywayland \
python311-xkbcommon"

inherit rpm
