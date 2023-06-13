SUMMARY = "SunPy core package: Python for Solar Physics"
DESCRIPTION = "SunPy is a Python library for solar physics data analysis and visualization."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & MIT"

PV = "4.1.3"

RPM_NAME = "python310-sunpy-4.1.3-2.2.aarch64.rpm"
RPM_HASH = "65420d7bd1e664a3f1d0adb5c523d07f5a9dade40265a43fc6da78563060707648eb00f638bd21f3467a73868fcf3e19a5bcd47d946295345451d78e7db8bc59"

RPROVIDES:${PN} += "python3-sunpy \
python3.10dist(sunpy) \
python310-sunpy \
python310-sunpy(aarch-64) \
python3dist(sunpy)"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
python(abi) \
python310-aioftp \
python310-astropy \
python310-numpy \
python310-packaging \
python310-parfive"

inherit rpm
