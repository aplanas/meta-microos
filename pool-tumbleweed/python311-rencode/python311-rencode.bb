SUMMARY = "Web safe object pickling/unpickling"
DESCRIPTION = "The rencode module is a modified version of bencode from the \
BitTorrent project.  For complex, heterogeneous data structures with \
many small elements, r-encodings take up significantly less space than \
b-encodings. Python2 version of package"
LICENSE = "GPL-3.0-or-later"

PV = "1.0.6"

RPM_NAME = "python311-rencode-1.0.6-1.25.aarch64.rpm"
RPM_HASH = "a5aebdcbbf096d8824b2b9f5e8c63c21ca244446411d106c8c3cfa6c206d709473363b40ab42f4ce620bcc77515e79b260964877d58151ab4240db8956ea5290"

RPROVIDES:${PN} += "python3-rencode \
python3.11dist-rencode \
python311-rencode \
python3dist-rencode"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
