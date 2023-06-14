SUMMARY = "Compatibility shim for Ansible 2.9 and newer"
DESCRIPTION = "Facilitate working with various versions of Ansible 2.9 and newer."
LICENSE = "MIT"

PV = "4.1.1"

RPM_NAME = "python3-ansible-compat-4.1.1-1.1.noarch.rpm"
RPM_HASH = "69657b06412a6e9a7353dbe8cc2deb46a17b21e8b510602b1fb06bc40011e4181b087993d9b818f6a799ad5d8b5537721e62ad9e424f70b9a3816637d122341d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ansible-compat \
python3.10dist-ansible-compat \
python3dist-ansible-compat"

RDEPENDS:${PN} += "python-abi \
python3-subprocess-tee \
python3.10dist-ansible-core \
python3.10dist-jsonschema \
python3.10dist-packaging \
python3.10dist-pyyaml \
python3.10dist-subprocess-tee"

inherit rpm
