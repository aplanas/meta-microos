SUMMARY = "Package to read and write statistical data files into pandas"
DESCRIPTION = "Reads and Writes SAS, SPSS and Stata files into pandas data frames."
LICENSE = "Apache-2.0"

PV = "1.2.2"

RPM_NAME = "python39-pyreadstat-1.2.2-1.1.aarch64.rpm"
RPM_HASH = "ddf772ed52e89915c7ea7422ff90397c60aad18606331eedf53ed85541b89fab805f023d1d8f4b0a0f1a89591b5cd455f21679f353546d8c194e1c554e91bf06"

RPROVIDES:${PN} += "python3.9dist-pyreadstat \
python39-pyreadstat \
python3dist-pyreadstat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1 \
python-abi \
python39-numpy \
python39-pandas"

inherit rpm
