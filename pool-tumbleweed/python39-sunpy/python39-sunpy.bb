SUMMARY = "SunPy core package: Python for Solar Physics"
DESCRIPTION = "SunPy is a Python library for solar physics data analysis and visualization."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & MIT"

PV = "4.1.3"

RPM_NAME = "python39-sunpy-4.1.3-2.4.aarch64.rpm"
RPM_HASH = "a58451cf5a52874c7e55c6268561185ad7536aba37dbb9578e57393d5d8ff9b52e6dd0d0b503e4a4e3680344dd7cedfcb7c1e478503a0f6a84bc8ce38c14225c"

RPROVIDES:${PN} += "python3.9dist-sunpy \
python39-sunpy \
python3dist-sunpy"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-aioftp \
python39-astropy \
python39-numpy \
python39-packaging \
python39-parfive"

inherit rpm
