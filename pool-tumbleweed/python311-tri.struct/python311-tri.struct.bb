SUMMARY = "Python dictionaries with attribute access"
DESCRIPTION = "tri.struct supplies classes that can be used like dictionaries and as \
objects with attribute access at the same time."
LICENSE = "BSD-3-Clause"

PV = "4.1.0"

RPM_NAME = "python311-tri.struct-4.1.0-1.4.aarch64.rpm"
RPM_HASH = "31e624a1c89bc0b1d2714a76780972694a448fdc70b35db59a0629986feb45be4d2ad7770ada4af1500aca90da79baaab5feba9cad3cba6e0161319474e0eb11"

RPROVIDES:${PN} += "python3.11dist(tri.struct) \
python311-tri.struct \
python311-tri.struct(aarch-64) \
python3dist(tri.struct)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
