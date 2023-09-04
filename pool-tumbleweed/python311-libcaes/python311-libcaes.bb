SUMMARY = "Library for AES encryption"
DESCRIPTION = "libcaes is a library for AES encryption."
LICENSE = "LGPL-3.0-or-later"

PV = "20230406"

RPM_NAME = "python311-libcaes-20230406-2.1.aarch64.rpm"
RPM_HASH = "9557cdab0842edc1ede5e83d7ebe634d5c9117c86013f0b3e316543ba6bb328c211287182bd1b2a12d59e524f7748394f513eda60844d75c28b280dd69c73de8"

RPROVIDES:${PN} += "python3-libcaes \
python311-libcaes"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcaes.so.1 \
libcerror.so.1 \
python-abi"

inherit rpm
