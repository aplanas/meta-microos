SUMMARY = "ASN.1 types and codecs"
DESCRIPTION = "This is an implementation of ASN.1 types and codecs in Python programming \
language. It has been first written to support particular protocol (SNMP) but \
then generalized to be suitable for a wide range of protocols based on ASN.1 \
specification."
LICENSE = "BSD-2-Clause"

PV = "0.5.0"

RPM_NAME = "python39-pyasn1-0.5.0-1.3.noarch.rpm"
RPM_HASH = "1971c17aed82b640fef0a948fc2a622ab032fc11200d3c2a3b7ef2a22d9b75a3bcbc92b6cc3a3b8819a8c75770c0b44b8fd20351c023dccc170b45b20ba099a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyasn1 \
python39-pyasn1 \
python3dist-pyasn1"

RDEPENDS:${PN} += "python-abi"

inherit rpm
