SUMMARY = "SunPy core package: Python for Solar Physics"
DESCRIPTION = "SunPy is a Python library for solar physics data analysis and visualization."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & MIT"

PV = "4.1.3"

RPM_NAME = "python311-sunpy-4.1.3-2.4.aarch64.rpm"
RPM_HASH = "550be8d71aeecd14352d07182325b0b08020d77df0c12ad24d77cb1c36d41289e179dfb135f0ab67e580133ea57196dc1ef296e4cbb6595b1dc201bf4e8c4552"

RPROVIDES:${PN} += "python3-sunpy \
python3.11dist-sunpy \
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
