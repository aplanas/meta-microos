SUMMARY = "Pure-Python Reed Solomon encoder/decoder"
DESCRIPTION = "A pure-python universal errors-and-erasures Reed-Solomon Codec, based on the wonderful tutorial at Wikiversity, \
written by 'Bobmath' and 'LRQ3000'. If you are just starting with Reed-Solomon error correction codes, \
the Wikiversity article is a good beginner's introduction. This is a burst-type implementation, \
so that it supports any Galois field higher than 2^3, but not binary streams."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python311-reedsolo-1.6.0-1.4.noarch.rpm"
RPM_HASH = "702dffd2738855b4e7df9e7e72b8b5b3869f54f6195e573f607c6f8e86747e8af05701db1e45c3b11d2711c57eda831ba91ad3a6613b96b4f188a7295c6d2e1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-reedsolo \
python3.11dist-reedsolo \
python311-reedsolo \
python3dist-reedsolo"

RDEPENDS:${PN} += "python-abi"

inherit rpm
