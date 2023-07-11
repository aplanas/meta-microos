SUMMARY = "Collection of protocols modules written in ASN.1 language"
DESCRIPTION = "This is an implementation of ASN.1 types and codecs in Python programming \
language. It has been first written to support particular protocol (SNMP) but \
then generalized to be suitable for a wide range of protocols based on ASN.1 \
specification."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "python311-pyasn1-modules-0.3.0-1.3.noarch.rpm"
RPM_HASH = "46582f6e20cafd4d335ae604d5cdd6600166064ed13d1965d7ae15d06f002e0795a92a9ed56e01d53e70d98b6b6fc87a7152d0ea9fb9bba19ad4cc627ae9144d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyasn1-modules \
python3.11dist-pyasn1-modules \
python311-pyasn1-modules \
python3dist-pyasn1-modules"

RDEPENDS:${PN} += "python-abi \
python311-pyasn1"

inherit rpm
