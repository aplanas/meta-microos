SUMMARY = "Python parser combinators"
DESCRIPTION = "Easy-to-use parser combinators, for parsing in pure Python."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python311-parsy-1.3.0-1.8.noarch.rpm"
RPM_HASH = "a4ceed160c816302c911b80e12732c074846c7cfae36f8f46abdec3686ef5a7bec25a9ddca4468daa90ed24b7b327776aa8e8e053166e26dbb9d709b3f6ca013"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-parsy \
python311-parsy \
python3dist-parsy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
