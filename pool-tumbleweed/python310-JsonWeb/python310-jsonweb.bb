SUMMARY = "Add JSON (de)serialization to your python objects"
DESCRIPTION = "Quickly add json serialization and deserialization \
to your python classes."
LICENSE = "BSD-3-Clause"

PV = "0.8.2"

RPM_NAME = "python310-JsonWeb-0.8.2-6.1.noarch.rpm"
RPM_HASH = "2f14c2e41b2f045bf25e8cc04b6b0b1e7b4e72e8bfe94b7f6e98ffb1abc916f40168b722c5ebfd4a7f6b9ce55eb2c9b141b53edc5f493f2ba3c2b2fe6ff577d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-JsonWeb \
python3.10dist-jsonweb \
python310-JsonWeb \
python3dist-jsonweb"

RDEPENDS:${PN} += "python-abi"

inherit rpm
