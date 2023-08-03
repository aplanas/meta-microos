SUMMARY = "Python library for extract property from data"
DESCRIPTION = "Python library for extract property from data."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python39-DataProperty-1.0.1-1.1.noarch.rpm"
RPM_HASH = "44fd7be254f3e593008bdf1756f1e45937b39eb206f4d34f94fe4d41c60707d2433ad463fb2019c94389a89e05a97b3b63c5f2b22520cc7825449467f4ed272d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dataproperty \
python39-DataProperty \
python3dist-dataproperty"

RDEPENDS:${PN} += "python-abi \
python39-mbstrdecoder \
python39-typepy"

inherit rpm
