SUMMARY = "U2F host library for interacting with a U2F device over USB"
DESCRIPTION = "U2F host library for interacting with a U2F device over USB."
LICENSE = "Apache-2.0"

PV = "0.1.5a"

RPM_NAME = "python310-pyu2f-0.1.5a-5.3.noarch.rpm"
RPM_HASH = "b7a59cd07daa53ede2db49fb2d45af4eb76765e4441427cca249e2546654dff92352979210bba59edabb34747fd94935d35cd3cdd9de85e9bdf7f113f3739b70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyu2f \
python310-pyu2f \
python3dist-pyu2f"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
