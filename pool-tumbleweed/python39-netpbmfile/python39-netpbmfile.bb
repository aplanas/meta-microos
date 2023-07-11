SUMMARY = "Read and write image files in the Netpbm format"
DESCRIPTION = "Netpbmfile is a Python library to read and write image files in the Netpbm \
format."
LICENSE = "BSD-3-Clause"

PV = "2020.10.18"

RPM_NAME = "python39-netpbmfile-2020.10.18-2.12.noarch.rpm"
RPM_HASH = "58ecc7afa8678fb534035a7470d01239f54d6cd5cc712140bf8d91ef50a4357a2f773f2c7ed40fd18acccbf9b482c26eef4f6595180d984190bfe3120419e840"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-netpbmfile \
python39-netpbmfile \
python3dist-netpbmfile"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-matplotlib \
python39-numpy \
update-alternatives"

inherit rpm
