SUMMARY = "Compatibility shim for Ansible 2.9 and newer"
DESCRIPTION = "Facilitate working with various versions of Ansible 2.9 and newer."
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "python3-ansible-compat-4.1.2-1.2.noarch.rpm"
RPM_HASH = "e21badb9a42eb84d31c5432b6d9e2067d92bb8738b118aedf8983108e31a888f4ee91b44142c2f983febf3dd8f8fe2537a52eac1d19a1ffb893c3109df4beeca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ansible-compat \
python3.11dist-ansible-compat \
python3dist-ansible-compat"

RDEPENDS:${PN} += "python-abi \
python3-subprocess-tee \
python3.11dist-ansible-core \
python3.11dist-jsonschema \
python3.11dist-packaging \
python3.11dist-pyyaml \
python3.11dist-subprocess-tee"

inherit rpm
