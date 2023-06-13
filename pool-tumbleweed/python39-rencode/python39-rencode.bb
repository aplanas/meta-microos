SUMMARY = "Web safe object pickling/unpickling"
DESCRIPTION = "The rencode module is a modified version of bencode from the \
BitTorrent project.  For complex, heterogeneous data structures with \
many small elements, r-encodings take up significantly less space than \
b-encodings. Python2 version of package"
LICENSE = "GPL-3.0-or-later"

PV = "1.0.6"

RPM_NAME = "python39-rencode-1.0.6-1.23.aarch64.rpm"
RPM_HASH = "2fad5701e4e400adb2bf467ef23184c7ab3a1e0cd2605854bcc33626dd28c9dab6281d0fc08d43b35a7fe179fad046239ddfd64e149a4b049a0fa5c4ad9a9309"

RPROVIDES:${PN} += "python3.9dist(rencode) \
python39-rencode \
python39-rencode(aarch-64) \
python3dist(rencode)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
