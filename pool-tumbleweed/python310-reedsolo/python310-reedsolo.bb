SUMMARY = "Pure-Python Reed Solomon encoder/decoder"
DESCRIPTION = "A pure-python universal errors-and-erasures Reed-Solomon Codec, based on the wonderful tutorial at Wikiversity, \
written by 'Bobmath' and 'LRQ3000'. If you are just starting with Reed-Solomon error correction codes, \
the Wikiversity article is a good beginner's introduction. This is a burst-type implementation, \
so that it supports any Galois field higher than 2^3, but not binary streams."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python310-reedsolo-1.6.0-1.3.noarch.rpm"
RPM_HASH = "dbcb6e7985a8bf4e73bebffe45d041ef83403987500afa2b0536f5ab957f545500633d44b60b47a92b14b54640cbcb82d4b4b51d3c1b448d3ee5495ea9402552"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-reedsolo \
python3.10dist(reedsolo) \
python310-reedsolo \
python3dist(reedsolo)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
