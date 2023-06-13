SUMMARY = "Pure-Python Reed Solomon encoder/decoder"
DESCRIPTION = "A pure-python universal errors-and-erasures Reed-Solomon Codec, based on the wonderful tutorial at Wikiversity, \
written by 'Bobmath' and 'LRQ3000'. If you are just starting with Reed-Solomon error correction codes, \
the Wikiversity article is a good beginner's introduction. This is a burst-type implementation, \
so that it supports any Galois field higher than 2^3, but not binary streams."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python39-reedsolo-1.6.0-1.3.noarch.rpm"
RPM_HASH = "e9e09d2888b8a5b1a98cdd7110851f1c9b07830a75bc3d089a54e8407821eb41c14b9db4a0576b762902700d7282c6f6f78be9c8c6debb2340263070f1042a8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(reedsolo) \
python39-reedsolo \
python3dist(reedsolo)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
