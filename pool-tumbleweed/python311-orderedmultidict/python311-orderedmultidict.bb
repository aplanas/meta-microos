SUMMARY = "Ordered Multivalue Dictionary"
DESCRIPTION = "Ordered Multivalue Dictionary - omdict."
LICENSE = "Unlicense"

PV = "1.0.1"

RPM_NAME = "python311-orderedmultidict-1.0.1-3.2.noarch.rpm"
RPM_HASH = "55e402c5946ba9ff2be74701b56c11d89ff42c2b2dedfaaf95b8167719fa4577b82e47de09817247766440e8385dd522c55f53e2816a542632a2c4ea8d9f9b11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-orderedmultidict \
python3.11dist-orderedmultidict \
python311-orderedmultidict \
python3dist-orderedmultidict"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
