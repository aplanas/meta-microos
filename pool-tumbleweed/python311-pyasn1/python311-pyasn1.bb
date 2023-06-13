SUMMARY = "ASN.1 types and codecs"
DESCRIPTION = "This is an implementation of ASN.1 types and codecs in Python programming \
language. It has been first written to support particular protocol (SNMP) but \
then generalized to be suitable for a wide range of protocols based on ASN.1 \
specification."
LICENSE = "BSD-2-Clause"

PV = "0.5.0"

RPM_NAME = "python311-pyasn1-0.5.0-1.1.noarch.rpm"
RPM_HASH = "f4fbf734c88a2071a93aca5fe99d0c622516b076241a194701c5a5aab2c5d949a5199f68bb597ac137ba7317355909bbe5e9e4e3ee448ab81c4970b3447e434e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyasn1) \
python311-pyasn1 \
python3dist(pyasn1)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
