SUMMARY = "Collection of protocols modules written in ASN.1 language"
DESCRIPTION = "This is an implementation of ASN.1 types and codecs in Python programming \
language. It has been first written to support particular protocol (SNMP) but \
then generalized to be suitable for a wide range of protocols based on ASN.1 \
specification."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "python311-pyasn1-modules-0.3.0-1.1.noarch.rpm"
RPM_HASH = "02bca3da2ae95e6a511b3151a27575ed6d3c1041b665ee8cf7fb1b2e80ff24a5104427cb45d98604a635f00009c82c6bd9113b3664e23bbe794b7022e282c07f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyasn1-modules) \
python311-pyasn1-modules \
python3dist(pyasn1-modules)"

RDEPENDS:${PN} += "python(abi) \
python311-pyasn1"

inherit rpm
