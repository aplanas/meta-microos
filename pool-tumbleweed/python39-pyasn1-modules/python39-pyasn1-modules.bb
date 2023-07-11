SUMMARY = "Collection of protocols modules written in ASN.1 language"
DESCRIPTION = "This is an implementation of ASN.1 types and codecs in Python programming \
language. It has been first written to support particular protocol (SNMP) but \
then generalized to be suitable for a wide range of protocols based on ASN.1 \
specification."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "python39-pyasn1-modules-0.3.0-1.3.noarch.rpm"
RPM_HASH = "e7a2bbb512f75dc5da2a27d453bbd134a13397f6dc43e6e96a500f39050b923f68412d9ada2f50761128ead8bb42ae1f07930b8a4266c6c9f9083897d72373cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyasn1-modules \
python39-pyasn1-modules \
python3dist-pyasn1-modules"

RDEPENDS:${PN} += "python-abi \
python39-pyasn1"

inherit rpm
