SUMMARY = "Affine transformation matrices"
DESCRIPTION = "Matrices describing affine transformation of the plane."
LICENSE = "BSD-3-Clause"

PV = "2.3.1"

RPM_NAME = "python311-affine-2.3.1-1.5.noarch.rpm"
RPM_HASH = "0e7006a82788ac604091b256200265664bfa941ba2a021bf3cf6f122fa7fb866650b1c0690104f8ef00600a68a260d052b44b192d20280bc7470bc384a235e08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-affine \
python3.11dist-affine \
python311-affine \
python3dist-affine"

RDEPENDS:${PN} += "python-abi"

inherit rpm
