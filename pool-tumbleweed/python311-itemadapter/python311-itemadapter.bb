SUMMARY = "Wrapper for data container objects"
DESCRIPTION = "The ItemAdapter class is a wrapper for data container objects, providing \
a common interface to handle objects of different types in an uniform \
manner, regardless of their underlying implementation."
LICENSE = "BSD-3-Clause"

PV = "0.7.0"

RPM_NAME = "python311-itemadapter-0.7.0-1.3.aarch64.rpm"
RPM_HASH = "cc05f6df44fcb66018ebba3458d9f9805deff89fb93b7eddb8d090c3c580e7e7d00e7447f418435516e9d3285ab362d8503e1399b75774b1a54f829d99a7dff5"

RPROVIDES:${PN} += "python3.11dist-itemadapter \
python311-itemadapter \
python3dist-itemadapter"

RDEPENDS:${PN} += "python-abi"

inherit rpm
