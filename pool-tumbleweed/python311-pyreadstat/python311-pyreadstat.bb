SUMMARY = "Package to read and write statistical data files into pandas"
DESCRIPTION = "Reads and Writes SAS, SPSS and Stata files into pandas data frames."
LICENSE = "Apache-2.0"

PV = "1.2.2"

RPM_NAME = "python311-pyreadstat-1.2.2-1.1.aarch64.rpm"
RPM_HASH = "3287e0632fd8be1930ce91313b678386d7d5e519d62c2171fb39d43681c396585a19509c3440dab3a9cbaa169fede0251269ad9f3435eee8818ca1764380930e"

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
