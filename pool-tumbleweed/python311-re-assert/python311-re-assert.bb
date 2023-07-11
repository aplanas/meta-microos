SUMMARY = "Show Python regex match assertion failures"
DESCRIPTION = "Show where your regex match assertion failed."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-re-assert-1.1.0-2.3.noarch.rpm"
RPM_HASH = "0bef98ec935057d622ec355e608af2ec46662fb639e5c8ced1281b104d57f485c98798d85d627887038237f04daf37277ef06d6b9ecf043b68708dde9ca90aa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-re-assert \
python3.11dist-re-assert \
python311-re-assert \
python3dist-re-assert"

RDEPENDS:${PN} += "python-abi \
python311-regex"

inherit rpm
