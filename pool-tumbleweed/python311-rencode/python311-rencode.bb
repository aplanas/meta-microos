SUMMARY = "Web safe object pickling/unpickling"
DESCRIPTION = "The rencode module is a modified version of bencode from the \
BitTorrent project.  For complex, heterogeneous data structures with \
many small elements, r-encodings take up significantly less space than \
b-encodings. Python2 version of package"
LICENSE = "GPL-3.0-or-later"

PV = "1.0.6"

RPM_NAME = "python311-rencode-1.0.6-1.23.aarch64.rpm"
RPM_HASH = "f28c8f9c1ab6f8fa14b928a67c1862e95e3659545d4a3e379b5aac1d8d2ab7c5833897eaeb85679c59da7d5dc1463869b2e481e76b1bc1d49e765eec5509e6ff"

RPROVIDES:${PN} += "python3.11dist-rencode \
python311-rencode \
python3dist-rencode"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
