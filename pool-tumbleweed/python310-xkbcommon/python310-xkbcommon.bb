SUMMARY = "Python bindings for libxkbcommon using cffi"
DESCRIPTION = "Python bindings for libxkbcommon using cffi"
LICENSE = "MIT"

PV = "0.8"

RPM_NAME = "python310-xkbcommon-0.8-1.4.aarch64.rpm"
RPM_HASH = "1f94620ec2046190b80f5997a42320f4d0682c330ff65375b015f87a75d86b421628b9a4007c1698f933298bf1f4f38e43a389af82a369cb3cae1d533a508394"

RPROVIDES:${PN} += "python3-xkbcommon \
python3.10dist(xkbcommon) \
python310-xkbcommon \
python310-xkbcommon(aarch-64) \
python3dist(xkbcommon)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libxkbcommon.so.0()(64bit) \
libxkbcommon.so.0(V_0.5.0)(64bit) \
libxkbcommon.so.0(V_0.6.0)(64bit) \
libxkbcommon.so.0(V_0.7.0)(64bit) \
libxkbcommon.so.0(V_0.8.0)(64bit) \
python(abi)"

inherit rpm
