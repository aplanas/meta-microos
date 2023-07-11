SUMMARY = "Wrapper for data container objects"
DESCRIPTION = "The ItemAdapter class is a wrapper for data container objects, providing \
a common interface to handle objects of different types in an uniform \
manner, regardless of their underlying implementation."
LICENSE = "BSD-3-Clause"

PV = "0.7.0"

RPM_NAME = "python311-itemadapter-0.7.0-1.4.aarch64.rpm"
RPM_HASH = "6fdbe315fa066a87f1772ee57dd2fcc002e215a219cbd84982eae64258137745d39d0e8117bbc07eede0ac2c4bda559a47eb64d0bc1ecff998d6b78ce88af8a5"

RPROVIDES:${PN} += "python3-itemadapter \
python3.11dist-itemadapter \
python311-itemadapter \
python3dist-itemadapter"

RDEPENDS:${PN} += "python-abi"

inherit rpm
