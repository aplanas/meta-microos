SUMMARY = "Azure Identity client library for Python"
DESCRIPTION = "Azure Identity authenticating with Azure Active Directory for Azure SDK \
libraries. It provides credentials Azure SDK clients can use to authenticate \
their requests."
LICENSE = "MIT"

PV = "1.13.0"

RPM_NAME = "python311-azure-identity-1.13.0-1.1.noarch.rpm"
RPM_HASH = "6ab79b52b3829a98ac63b3c6a8cb1f5324efe8a33f7f649cb43dabcbc07e501303faef57e8819fc904cc950cddbf60fd4ba405ac08eed93842dada06f0b1fd93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-identity \
python311-azure-identity \
python3dist-azure-identity"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-nspkg \
python311-cryptography \
python311-msal \
python311-msal-extensions \
python311-six"

inherit rpm
