SUMMARY = "Python module to produce formatted YAML-serialized data"
DESCRIPTION = "PyYAML-based python module to produce formatted YAML-serialized data."
LICENSE = "WTFPL"

PV = "21.10.1"

RPM_NAME = "python311-pyaml-21.10.1-1.10.noarch.rpm"
RPM_HASH = "f9338b648b375776de9ede05046b706b1fd5245b082b054227373e6963aec7b5e459a196fa0f95e74fb4982e97c111ede65c176cf7d7630d99a5b9100478386c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyaml \
python3.11dist-pyaml \
python311-pyaml \
python3dist-pyaml"

RDEPENDS:${PN} += "python-abi \
python311-PyYAML"

inherit rpm
