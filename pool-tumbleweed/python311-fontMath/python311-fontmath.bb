SUMMARY = "A set of objects for performing math operations on font data"
DESCRIPTION = "A set of objects for performing math operations on font data."
LICENSE = "MIT"

PV = "0.9.3"

RPM_NAME = "python311-fontMath-0.9.3-1.3.noarch.rpm"
RPM_HASH = "d8ec23b9a404422a941a2ab862084c8f92bbed6b87915b0b98eb853caebed12a6288e6278187d5efef5b5d33bda31f868a58a799437aa106fd327e9323e47c75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(fontmath) \
python311-fontMath \
python3dist(fontmath)"

RDEPENDS:${PN} += "python(abi) \
python311-FontTools"

inherit rpm
