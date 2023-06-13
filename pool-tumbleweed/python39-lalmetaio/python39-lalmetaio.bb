SUMMARY = "LSC Algorithm MetaIO Library"
DESCRIPTION = "The LSC Algorithm MetaIO Library for gravitational wave data analysis."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.0"

RPM_NAME = "python39-lalmetaio-3.0.0-1.2.aarch64.rpm"
RPM_HASH = "ebd7e4d07ee8753da1fdd40b5d06aa9b36372cfbdec9437881de09abe83c3dee7ad893be31698d50a108c602a8cea5c3462b1598dd41c6e4c16cfc4ee123fb39"

RPROVIDES:${PN} += "python39-lalmetaio \
python39-lalmetaio(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
liblal.so.20()(64bit) \
liblalmetaio.so.10()(64bit) \
liblalsupport.so.14()(64bit) \
python(abi) \
python39-lal \
python39-numpy"

inherit rpm
