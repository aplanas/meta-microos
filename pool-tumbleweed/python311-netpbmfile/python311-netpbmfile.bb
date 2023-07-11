SUMMARY = "Read and write image files in the Netpbm format"
DESCRIPTION = "Netpbmfile is a Python library to read and write image files in the Netpbm \
format."
LICENSE = "BSD-3-Clause"

PV = "2020.10.18"

RPM_NAME = "python311-netpbmfile-2020.10.18-2.12.noarch.rpm"
RPM_HASH = "135f7bb4a00e53c40ebc1ae53309d8fe37c9246e83f8ca42c6444e20ddf63c4c1b086a670df87732ae8c6c0b3356b804046837d0e23124639d2365b80eebd6f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-netpbmfile \
python3.11dist-netpbmfile \
python311-netpbmfile \
python3dist-netpbmfile"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-matplotlib \
python311-numpy \
update-alternatives"

inherit rpm
