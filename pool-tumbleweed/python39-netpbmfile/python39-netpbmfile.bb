SUMMARY = "Read and write image files in the Netpbm format"
DESCRIPTION = "Netpbmfile is a Python library to read and write image files in the Netpbm \
format."
LICENSE = "BSD-3-Clause"

PV = "2020.10.18"

RPM_NAME = "python39-netpbmfile-2020.10.18-2.10.noarch.rpm"
RPM_HASH = "809a5060fb8a4ab713b21184a4e7efc4f9fc86a1f9d0031a21f5009b337a8ed358f14684e2186ad1fcf17ed7246397739b4965b5974fe7882c293472e4c72b20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-netpbmfile \
python39-netpbmfile \
python3dist-netpbmfile"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-matplotlib \
python39-numpy \
update-alternatives"

inherit rpm
