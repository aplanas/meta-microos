SUMMARY = "Collection of protocols modules written in ASN.1 language"
DESCRIPTION = "This is an implementation of ASN.1 types and codecs in Python programming \
language. It has been first written to support particular protocol (SNMP) but \
then generalized to be suitable for a wide range of protocols based on ASN.1 \
specification."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "python310-pyasn1-modules-0.3.0-1.1.noarch.rpm"
RPM_HASH = "b6a8679e1542a98aa9b5390601fb3e4519350be004a9c24284395e2e97d1deb0a99c2b3fe730ebdce211cb59b034aabcc9c56ab1db4524df427d87fc6959861d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyasn1-modules \
python3.10dist-pyasn1-modules \
python310-pyasn1-modules \
python3dist-pyasn1-modules"

RDEPENDS:${PN} += "python-abi \
python310-pyasn1"

inherit rpm
