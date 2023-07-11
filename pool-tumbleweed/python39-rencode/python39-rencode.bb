SUMMARY = "Web safe object pickling/unpickling"
DESCRIPTION = "The rencode module is a modified version of bencode from the \
BitTorrent project.  For complex, heterogeneous data structures with \
many small elements, r-encodings take up significantly less space than \
b-encodings. Python2 version of package"
LICENSE = "GPL-3.0-or-later"

PV = "1.0.6"

RPM_NAME = "python39-rencode-1.0.6-1.25.aarch64.rpm"
RPM_HASH = "fc7d52d4a56c8da2f23529da41145f9f61a3f3f2c0a6fbd2220ff02033e2cef5e5d197bfa112cf56a631d4fa1c05f8b8f7e7dd45a2465fd87db2b471e7e5aac0"

RPROVIDES:${PN} += "python3.9dist-rencode \
python39-rencode \
python3dist-rencode"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
