SUMMARY = "Package to read and write statistical data files into pandas"
DESCRIPTION = "Reads and Writes SAS, SPSS and Stata files into pandas data frames."
LICENSE = "Apache-2.0"

PV = "1.2.2"

RPM_NAME = "python310-pyreadstat-1.2.2-1.1.aarch64.rpm"
RPM_HASH = "bb0113772a28e3571ee966d1a234f013f477d1e5b6b422fa934620a28cecec380df49fdacfcf6eb5a67ab101ec95eb84b49c2ebc7f7f371ab9afe3402c324fa0"

RPROVIDES:${PN} += "python3.10dist-pyreadstat \
python310-pyreadstat \
python3dist-pyreadstat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1 \
python-abi \
python310-numpy \
python310-pandas"

inherit rpm
