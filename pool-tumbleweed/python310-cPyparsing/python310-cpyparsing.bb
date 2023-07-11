SUMMARY = "Cython implementation of PyParsing"
DESCRIPTION = "Cython implementation of PyParsing created for use in Coconut and Undebt."
LICENSE = "Apache-2.0"

PV = "2.4.7.1.2.1"

RPM_NAME = "python310-cPyparsing-2.4.7.1.2.1-1.3.aarch64.rpm"
RPM_HASH = "79cb1d008747e7e4caddb951663763e556dddcb7c5a8a07370420134cfd525bd6ae71cc449558033cdc336d987b568028b2cd3c7f2e780510d706bd0ca65f662"

RPROVIDES:${PN} += "python3.10dist-cpyparsing \
python310-cPyparsing \
python3dist-cpyparsing"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
