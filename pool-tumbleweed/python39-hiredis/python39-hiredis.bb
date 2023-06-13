SUMMARY = "Python wrapper for hiredis"
DESCRIPTION = "Python wrapper for hiredis C connector."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "python39-hiredis-2.2.2-2.3.aarch64.rpm"
RPM_HASH = "6a9d7e1b6322bb79e491e98aff2ab760a6b0da5c0a147d0960248bcdd78479667910a154804bc300c702607e42cf0bbbf27e6b0329dc3f55bba5ff7641cf4e0b"

RPROVIDES:${PN} += "python3.9dist(hiredis) \
python39-hiredis \
python39-hiredis(aarch-64) \
python3dist(hiredis)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libhiredis.so.1.1.0()(64bit) \
python(abi)"

inherit rpm
