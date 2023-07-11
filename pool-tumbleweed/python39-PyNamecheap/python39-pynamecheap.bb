SUMMARY = "Namecheap API client in Python"
DESCRIPTION = "Namecheap API client in Python"
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python39-PyNamecheap-0.0.3-2.16.noarch.rpm"
RPM_HASH = "012ab4c7bebac4b3a48dc5f51edb41a2183ae4bc52d44d195f888e0ddee40450d9dce2aa076d2f3e49df761f887b044c6c80c42c142550d48146ae45c902d9f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pynamecheap \
python39-PyNamecheap \
python3dist-pynamecheap"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
