SUMMARY = "Package to read and write statistical data files into pandas"
DESCRIPTION = "Reads and Writes SAS, SPSS and Stata files into pandas data frames."
LICENSE = "Apache-2.0"

PV = "1.2.3"

RPM_NAME = "python39-pyreadstat-1.2.3-1.1.aarch64.rpm"
RPM_HASH = "6f70d87684cd12d11003871caf75e5d88ca435120aadb3c314b818469e65e22a55d22cadeceb2361388c307dc4b57de8a4fcda0b5a9194d28c9905d718ed0fa6"

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
