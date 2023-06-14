SUMMARY = "SunPy core package: Python for Solar Physics"
DESCRIPTION = "SunPy is a Python library for solar physics data analysis and visualization."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & MIT"

PV = "4.1.3"

RPM_NAME = "python311-sunpy-4.1.3-2.2.aarch64.rpm"
RPM_HASH = "c56bccee1ae0c2ec4e127483c02b17a306b4984110e4173739ac4604c10f5b952ef8a75dc99b4892e66a73b9b6c71200c711306e3550a93ecf03a4f2d85c6d01"

RPROVIDES:${PN} += "python3.11dist-sunpy \
python311-sunpy \
python3dist-sunpy"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-aioftp \
python311-astropy \
python311-numpy \
python311-packaging \
python311-parfive"

inherit rpm
