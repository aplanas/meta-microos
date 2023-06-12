SUMMARY = "S-expressions tool for Numpy"
DESCRIPTION = "Snuggs are s-expressions for Numpy."
LICENSE = "MIT"

PV = "1.4.7"

RPM_NAME = "python311-snuggs-1.4.7-2.7.noarch.rpm"
RPM_HASH = "0d072610a022b0bc050d8bd6fa1a45107cdab32c32edd313289134de9a3073b3a7bfd01a7a3aef5652c69690bbebefcc934d02532ee6fb07b6be15fb1bfdbe6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(snuggs) \
python311-snuggs \
python3dist(snuggs)"
RDEPENDS:${PN} += "python(abi) \
python311-numpy \
python311-pyparsing"

inherit rpm
