SUMMARY = "Deals with Unicode byte order marks"
DESCRIPTION = "bom is a simple UNIX command line utility for dealing with Unicode byte \
order marks (BOM's). \
 \
Unicode byte order marks are 'magic number' byte sequences that sometimes \
appear at the beginning of a file to indicate the file's character \
encoding. They're sometimes helpful but usually they're just annoying."
LICENSE = "Apache-2.0"

PV = "1.0.1"

RPM_NAME = "bom-1.0.1-1.7.aarch64.rpm"
RPM_HASH = "d90e2b16496e110d97cb29f5e3e142eb6046a3f675f0e7e241c22926365663836b51164064aa25c808e7050399593199db50d95833320b3c9947c23675408fc0"

RPROVIDES:${PN} += "bom \
bom(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
