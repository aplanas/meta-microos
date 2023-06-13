SUMMARY = "ASN.1 types and codecs"
DESCRIPTION = "This is an implementation of ASN.1 types and codecs in Python programming \
language. It has been first written to support particular protocol (SNMP) but \
then generalized to be suitable for a wide range of protocols based on ASN.1 \
specification."
LICENSE = "BSD-2-Clause"

PV = "0.5.0"

RPM_NAME = "python310-pyasn1-0.5.0-1.1.noarch.rpm"
RPM_HASH = "657b19dff85d8b82ee334a63f2e7e54c8f8e19022092a79e54bfc8896f8fe6f191d9122ee02dee1c3f3a6b4d904e748dc7f1aaec454324dc3b910420587cc661"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyasn1 \
python3.10dist(pyasn1) \
python310-pyasn1 \
python3dist(pyasn1)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
