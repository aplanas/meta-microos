SUMMARY = "ASN.1 types and codecs"
DESCRIPTION = "This is an implementation of ASN.1 types and codecs in Python programming \
language. It has been first written to support particular protocol (SNMP) but \
then generalized to be suitable for a wide range of protocols based on ASN.1 \
specification."
LICENSE = "BSD-2-Clause"

PV = "0.5.0"

RPM_NAME = "python311-pyasn1-0.5.0-1.3.noarch.rpm"
RPM_HASH = "b9d1d6806da6b18b233c2307d283f2ae60c0f3b36034ad69eadcc15df7e7c78cd0c06f29b0e55718d73586634e889b5c46812b1d4099b1c3de791fd86bd46a46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyasn1 \
python3.11dist-pyasn1 \
python311-pyasn1 \
python3dist-pyasn1"

RDEPENDS:${PN} += "python-abi"

inherit rpm
