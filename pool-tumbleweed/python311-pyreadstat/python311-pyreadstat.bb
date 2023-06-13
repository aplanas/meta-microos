SUMMARY = "Package to read and write statistical data files into pandas"
DESCRIPTION = "Reads and Writes SAS, SPSS and Stata files into pandas data frames."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "python311-pyreadstat-1.2.1-1.4.aarch64.rpm"
RPM_HASH = "ab823a5d3842a3eafb0a2ac91d6e9b799fa4b43a4f526ea53419239f407eabf059c6f52ae0103e9298ab70982f88cc135659808b1591ab7bb3cde38534810c63"

RPROVIDES:${PN} += "python3.11dist(pyreadstat) \
python311-pyreadstat \
python311-pyreadstat(aarch-64) \
python3dist(pyreadstat)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libz.so.1()(64bit) \
python(abi) \
python311-numpy \
python311-pandas"

inherit rpm
