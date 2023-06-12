SUMMARY = "Package to read and write statistical data files into pandas"
DESCRIPTION = "Reads and Writes SAS, SPSS and Stata files into pandas data frames."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "python39-pyreadstat-1.2.1-1.4.aarch64.rpm"
RPM_HASH = "eb90aa68e07564abdc204eaf24c17e064b0ddbba1c327cb7f66ad73d3db670ce91a2264b68a8914439f788a0c951a2464e6b0ce28bb69ee77cfa291adc52f86e"

RPROVIDES:${PN} += "python3.9dist(pyreadstat) \
python39-pyreadstat \
python39-pyreadstat(aarch-64) \
python3dist(pyreadstat)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit) \
python(abi) \
python39-numpy \
python39-pandas"

inherit rpm
