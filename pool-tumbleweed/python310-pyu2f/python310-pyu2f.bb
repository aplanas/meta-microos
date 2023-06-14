SUMMARY = "U2F host library for interacting with a U2F device over USB"
DESCRIPTION = "U2F host library for interacting with a U2F device over USB."
LICENSE = "Apache-2.0"

PV = "0.1.5a"

RPM_NAME = "python310-pyu2f-0.1.5a-5.1.noarch.rpm"
RPM_HASH = "8c758353cfe872c82b0ac0488653ce2de2fc6b082f6ebf1ce628b49b52eaca0a178c5ce5aa6a52971b48f8254d59ccd556f2f3e2723a23178aa18f12db8954fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyu2f \
python3.10dist-pyu2f \
python310-pyu2f \
python3dist-pyu2f"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
