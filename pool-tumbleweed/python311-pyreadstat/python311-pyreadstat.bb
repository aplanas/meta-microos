SUMMARY = "Package to read and write statistical data files into pandas"
DESCRIPTION = "Reads and Writes SAS, SPSS and Stata files into pandas data frames."
LICENSE = "Apache-2.0"

PV = "1.2.3"

RPM_NAME = "python311-pyreadstat-1.2.3-1.1.aarch64.rpm"
RPM_HASH = "bbee4efd9635a437dcea19aa7cddeb5ef4dcca51ea20d508c363691f4a888eb230ed8c114bb4113dfc8f9515da99fc55a608ae2e2a2326931a7290b06757e6f5"

RPROVIDES:${PN} += "python3-pyreadstat \
python3.11dist-pyreadstat \
python311-pyreadstat \
python3dist-pyreadstat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1 \
python-abi \
python311-numpy \
python311-pandas"

inherit rpm
