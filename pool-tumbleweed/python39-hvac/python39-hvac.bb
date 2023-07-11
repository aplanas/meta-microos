SUMMARY = "HashiCorp Vault API client"
DESCRIPTION = "HashiCorp Vault API client for Python 2/3"
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python39-hvac-1.1.0-1.4.noarch.rpm"
RPM_HASH = "cfd372158a5233323aba35d21f61e4efb8e2bccdc5d5be87bd049650e525d0043ed4ff8b8206c460e2f9e9dbfe1778d8aad5189d8cdbc00bcc6decbf934f9efb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hvac \
python39-hvac \
python3dist-hvac"

RDEPENDS:${PN} += "python-abi \
python39-pyhcl \
python39-requests"

inherit rpm
