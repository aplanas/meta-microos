SUMMARY = "ASN.1 types and codecs"
DESCRIPTION = "This is an implementation of ASN.1 types and codecs in Python programming \
language. It has been first written to support particular protocol (SNMP) but \
then generalized to be suitable for a wide range of protocols based on ASN.1 \
specification."
LICENSE = "BSD-2-Clause"

PV = "0.5.0"

RPM_NAME = "python310-pyasn1-0.5.0-1.3.noarch.rpm"
RPM_HASH = "408a6e87e2b6cfd609f4d982153e85968609f7e07f3397bb5cfc5c90b23f80316b7aaac313940f4bd80a7233e37fc6a7367eb7d02b3cadd75bb623789a567545"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyasn1 \
python310-pyasn1 \
python3dist-pyasn1"

RDEPENDS:${PN} += "python-abi"

inherit rpm
