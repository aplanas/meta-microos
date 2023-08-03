SUMMARY = "Compatibility shim for Ansible 2.9 and newer"
DESCRIPTION = "Facilitate working with various versions of Ansible 2.9 and newer."
LICENSE = "MIT"

PV = "4.1.5"

RPM_NAME = "python3-ansible-compat-4.1.5-1.1.noarch.rpm"
RPM_HASH = "69b1ac1d6183be8546ad592c6c94bdcc53f8ba6a34c66c30fc2c80f9655bd03a059f8624a3133a81b931f412874532d65a10179bdca31fd151e6690d66e9c4e3"
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
