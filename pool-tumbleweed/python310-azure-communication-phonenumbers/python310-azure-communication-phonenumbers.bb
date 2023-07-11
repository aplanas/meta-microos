SUMMARY = "Microsoft Azure Communication Phone Numbers Client Library for Python"
DESCRIPTION = "Azure Communication Phone Numbers Package client library for Python \
 \
Azure Communication Phone Numbers client package is used to administer Phone Numbers."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-azure-communication-phonenumbers-1.1.0-1.4.noarch.rpm"
RPM_HASH = "d9dc0c14690daceda3c6914f45e56537c1fc30507434024b2301115428fd4c8c2d7516e847778ea64004e38db4a6ea0cf34c0f1fcdcf789637a11738274a924c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-communication-phonenumbers \
python310-azure-communication-phonenumbers \
python3dist-azure-communication-phonenumbers"

RDEPENDS:${PN} += "python-abi \
python310-azure-communication-nspkg \
python310-azure-core \
python310-azure-nspkg \
python310-msrest \
python310-six"

inherit rpm
