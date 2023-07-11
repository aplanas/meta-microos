SUMMARY = "Pure-Python Reed Solomon encoder/decoder"
DESCRIPTION = "A pure-python universal errors-and-erasures Reed-Solomon Codec, based on the wonderful tutorial at Wikiversity, \
written by 'Bobmath' and 'LRQ3000'. If you are just starting with Reed-Solomon error correction codes, \
the Wikiversity article is a good beginner's introduction. This is a burst-type implementation, \
so that it supports any Galois field higher than 2^3, but not binary streams."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python39-reedsolo-1.6.0-1.4.noarch.rpm"
RPM_HASH = "e25addb6684b0e07603712dd5b541ea7d7aca5608812c35e2f8f4b74fc55cd1a43de193492c818b64d1c2174695898d26285f2091194fd774020b8a989934129"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-reedsolo \
python39-reedsolo \
python3dist-reedsolo"

RDEPENDS:${PN} += "python-abi"

inherit rpm
