SUMMARY = "Read and write image files in the Netpbm format"
DESCRIPTION = "Netpbmfile is a Python library to read and write image files in the Netpbm \
format."
LICENSE = "BSD-3-Clause"

PV = "2020.10.18"

RPM_NAME = "python310-netpbmfile-2020.10.18-2.12.noarch.rpm"
RPM_HASH = "b54a7665800ed0ebc39f8ceee7caecdc6c1c8fc7e96fa49911448e68f6a241110dfca87578e2ecb81a4b5847728156e904a8da7fe8c034c10974f174de087486"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-netpbmfile \
python310-netpbmfile \
python3dist-netpbmfile"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-matplotlib \
python310-numpy \
update-alternatives"

inherit rpm
