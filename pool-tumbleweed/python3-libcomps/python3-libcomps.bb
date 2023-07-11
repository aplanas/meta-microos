SUMMARY = "Python 3 bindings for libcomps library"
DESCRIPTION = "This package provides the Python 3 bindings for libcomps library."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.19"

RPM_NAME = "python3-libcomps-0.1.19-2.4.aarch64.rpm"
RPM_HASH = "855b35151afd1043eaa802690a31c54af52ea2b6022f4516c18c17b649ef9651dc172ad99a75a7062b15902db3447ff7e5aa803161dab3804ae069b660cda5e4"

RPROVIDES:${PN} += "python3-libcomps \
python3.11dist-libcomps \
python3dist-libcomps"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcomps.so.0 \
libcomps0 \
libpython3.11.so.1.0 \
libz.so.1 \
python-abi"

inherit rpm
