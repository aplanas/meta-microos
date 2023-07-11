SUMMARY = "Codecs for reading/writing documents in the ANSEL character set"
DESCRIPTION = "Codecs for reading/writing documents in the ANSEL character set."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-ansel-1.0.0-2.3.noarch.rpm"
RPM_HASH = "f983ab2bfdd85c20a5f615c0975da3be1b435d296fed83c0f68eb756071e7690aafa37b3f0637c1abc883a7f4ef979c7d4d44a818fe54a5fc38245a5e0e26c92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ansel \
python3.11dist-ansel \
python311-ansel \
python3dist-ansel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
