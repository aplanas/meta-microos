SUMMARY = "Package to read and write statistical data files into pandas"
DESCRIPTION = "Reads and Writes SAS, SPSS and Stata files into pandas data frames."
LICENSE = "Apache-2.0"

PV = "1.2.3"

RPM_NAME = "python310-pyreadstat-1.2.3-1.1.aarch64.rpm"
RPM_HASH = "2f26c858201b9a00fb75393e1c0fbc9d577d1f28c70f9a6020eccc5b3f4b817dee36dcf5dc5628923cc85d01a3c94a5be59057e2e6e499934cfb3caf29c3f01b"

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
