SUMMARY = "Collection of protocols modules written in ASN.1 language"
DESCRIPTION = "This is an implementation of ASN.1 types and codecs in Python programming \
language. It has been first written to support particular protocol (SNMP) but \
then generalized to be suitable for a wide range of protocols based on ASN.1 \
specification."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "python310-pyasn1-modules-0.3.0-1.3.noarch.rpm"
RPM_HASH = "9fbb359bdb3e73db1516cbc825fd9b13816ca462056ec5a359941c635c14a125a06f875e1f36a0c7558a05a63825ee05c88b1f765ca601520355ce63896e196b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyasn1-modules \
python310-pyasn1-modules \
python3dist-pyasn1-modules"

RDEPENDS:${PN} += "python-abi \
python310-pyasn1"

inherit rpm
