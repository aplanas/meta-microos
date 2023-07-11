SUMMARY = "Pyramid exceptions logger"
DESCRIPTION = "A library for converting a token stream into a data structure comprised of \
sequences, mappings, and scalars, developed primarily for converting HTTP form \
POST data into a richer data structure."
LICENSE = "BSD-4-Clause & ZPL-2.1 & MIT"

PV = "0.6"

RPM_NAME = "python311-peppercorn-0.6-4.3.noarch.rpm"
RPM_HASH = "bd86f3f4f28a2957d5299fb3673f01b7c2232207edeb79ba2ac8a36c0d76103e704305a6188173e5a3123d9510845b8ffb3afb30746ba67ac35eaebc2810fc2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-peppercorn \
python3.11dist-peppercorn \
python311-peppercorn \
python3dist-peppercorn"

RDEPENDS:${PN} += "python-abi"

inherit rpm
