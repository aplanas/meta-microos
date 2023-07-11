SUMMARY = "Microsoft Azure Communication Phone Numbers Client Library for Python"
DESCRIPTION = "Azure Communication Phone Numbers Package client library for Python \
 \
Azure Communication Phone Numbers client package is used to administer Phone Numbers."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-azure-communication-phonenumbers-1.1.0-1.4.noarch.rpm"
RPM_HASH = "fd6192de09a0496a98f38c73c73c3b70bf43089585621e5f324c25bdd01229a2b8e9e0811c80bc28397388b98c1a5c27792af4013b1368f46722e230bbd6095c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-communication-phonenumbers \
python3.11dist-azure-communication-phonenumbers \
python311-azure-communication-phonenumbers \
python3dist-azure-communication-phonenumbers"

RDEPENDS:${PN} += "python-abi \
python311-azure-communication-nspkg \
python311-azure-core \
python311-azure-nspkg \
python311-msrest \
python311-six"

inherit rpm
