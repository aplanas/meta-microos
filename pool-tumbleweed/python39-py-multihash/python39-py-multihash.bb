SUMMARY = "Multihash implementation in Python"
DESCRIPTION = "Multihash is a protocol for differentiating outputs from \
various well-established hash functions, addressing size \
and encoding considerations."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python39-py-multihash-2.0.1-1.11.noarch.rpm"
RPM_HASH = "650351af15916c59be4b0e95c39ae48caeebde0240adae7c581c2f4a2ef5b25a61d9e85431fca646be3bf6f7acbdfa7cd5e56a2df2d23dc366fe397dc70c8643"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-py-multihash \
python39-py-multihash \
python3dist-py-multihash"

RDEPENDS:${PN} += "python-abi"

inherit rpm
