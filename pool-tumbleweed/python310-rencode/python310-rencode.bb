SUMMARY = "Web safe object pickling/unpickling"
DESCRIPTION = "The rencode module is a modified version of bencode from the \
BitTorrent project.  For complex, heterogeneous data structures with \
many small elements, r-encodings take up significantly less space than \
b-encodings. Python2 version of package"
LICENSE = "GPL-3.0-or-later"

PV = "1.0.6"

RPM_NAME = "python310-rencode-1.0.6-1.25.aarch64.rpm"
RPM_HASH = "a09331787d72a7681543063f79ecf5a43f79d80b51419374c7e7221f7e1887bc179f96fe5d49684fc5e56c055f296d33832acebf2e096d26d3eab981dc96a243"

RPROVIDES:${PN} += "python3.10dist-rencode \
python310-rencode \
python3dist-rencode"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
