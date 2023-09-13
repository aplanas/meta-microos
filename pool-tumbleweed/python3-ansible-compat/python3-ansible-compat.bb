SUMMARY = "Compatibility shim for Ansible 2.9 and newer"
DESCRIPTION = "Facilitate working with various versions of Ansible 2.9 and newer."
LICENSE = "MIT"

PV = "4.1.10"

RPM_NAME = "python3-ansible-compat-4.1.10-1.1.noarch.rpm"
RPM_HASH = "e2d9ab9171971a9bd51b2f37ab62129544c450c4329431b8419c6b44c473938ea1836daad0c8e74113186b67738ab578be62f402c1292086df7efdd72343be1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ansible-compat \
python3.11dist-ansible-compat \
python3dist-ansible-compat"

RDEPENDS:${PN} += "ansible-core \
python-abi \
python3-PyYAML \
python3-jsonschema \
python3-packaging \
python3-subprocess-tee \
python3.11dist-ansible-core \
python3.11dist-jsonschema \
python3.11dist-packaging \
python3.11dist-pyyaml \
python3.11dist-subprocess-tee"

inherit rpm
