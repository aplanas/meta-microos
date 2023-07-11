SUMMARY = "HashiCorp Vault API client"
DESCRIPTION = "HashiCorp Vault API client for Python 2/3"
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python311-hvac-1.1.0-1.4.noarch.rpm"
RPM_HASH = "485f652d039da9528da9820d7b9028a387ad669e2a08b190bb3e6cb9f8a3cdaa0ce7b3493185e8d5ae61ce080b84425fa834948d6fb3f57541e9c474f48c01a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hvac \
python3.11dist-hvac \
python311-hvac \
python3dist-hvac"

RDEPENDS:${PN} += "python-abi \
python311-pyhcl \
python311-requests"

inherit rpm
