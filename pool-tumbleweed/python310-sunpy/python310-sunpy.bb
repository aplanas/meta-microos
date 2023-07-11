SUMMARY = "SunPy core package: Python for Solar Physics"
DESCRIPTION = "SunPy is a Python library for solar physics data analysis and visualization."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & MIT"

PV = "4.1.3"

RPM_NAME = "python310-sunpy-4.1.3-2.4.aarch64.rpm"
RPM_HASH = "f9c9cd735f064619276f43aac1ebf29e05097956065e4b22d38eb39ebec7cb574598ef039c6bdca98a5061855a45b314c7d9260ee71ba772df4a1dcbe5c89183"

RPROVIDES:${PN} += "python3.10dist-sunpy \
python310-sunpy \
python3dist-sunpy"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-aioftp \
python310-astropy \
python310-numpy \
python310-packaging \
python310-parfive"

inherit rpm
