SUMMARY = "Pure-Python Reed Solomon encoder/decoder"
DESCRIPTION = "A pure-python universal errors-and-erasures Reed-Solomon Codec, based on the wonderful tutorial at Wikiversity, \
written by 'Bobmath' and 'LRQ3000'. If you are just starting with Reed-Solomon error correction codes, \
the Wikiversity article is a good beginner's introduction. This is a burst-type implementation, \
so that it supports any Galois field higher than 2^3, but not binary streams."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python310-reedsolo-1.6.0-1.4.noarch.rpm"
RPM_HASH = "213326cd9223b9e154437c05ccb23f5b90a5919632d86b915a879210ac962f9bb05cf959cb8de54de31fdfb8233d3040eeb0e50f58fda16637fb9190ad2ab5a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-reedsolo \
python310-reedsolo \
python3dist-reedsolo"

RDEPENDS:${PN} += "python-abi"

inherit rpm
