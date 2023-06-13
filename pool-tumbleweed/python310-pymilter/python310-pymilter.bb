SUMMARY = "Python interface to the sendmail milter API"
DESCRIPTION = "This is a Python extension module to enable python scripts to attach to \
sendmail's libmilter functionality. Additional Python modules provide for \
navigation and modification of MIME parts, sending DSNs, and doing CBV."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.4"

RPM_NAME = "python310-pymilter-1.0.4-3.12.aarch64.rpm"
RPM_HASH = "0176b3ec659ebf7e18e71c4a9fe8cc8cd25433fb82ba806eb666604ba414eba167439789b508713908a7c732ece8ae1448b949f5f3a69f2c70fed9b444ad9a82"

RPROVIDES:${PN} += "python3-pymilter \
python3.10dist(pymilter) \
python310-pymilter \
python310-pymilter(aarch-64) \
python3dist(pymilter)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libmilter.so.1.0()(64bit) \
pymilter-common \
python(abi) \
python310 \
python310-py3dns"

inherit rpm
