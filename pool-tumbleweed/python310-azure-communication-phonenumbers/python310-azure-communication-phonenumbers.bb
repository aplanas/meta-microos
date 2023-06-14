SUMMARY = "Microsoft Azure Communication Phone Numbers Client Library for Python"
DESCRIPTION = "Azure Communication Phone Numbers Package client library for Python \
 \
Azure Communication Phone Numbers client package is used to administer Phone Numbers."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-azure-communication-phonenumbers-1.1.0-1.2.noarch.rpm"
RPM_HASH = "6cfabc01afdab8c1d89d0b290045ae94ed2da8d3ba5fd1fa0d5d61c2d6617565b641fc53c7830ef416de4fe40f3f84841fdec578c4e8df823f2144296d537428"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-communication-phonenumbers \
python3.10dist-azure-communication-phonenumbers \
python310-azure-communication-phonenumbers \
python3dist-azure-communication-phonenumbers"

RDEPENDS:${PN} += "python-abi \
python310-azure-communication-nspkg \
python310-azure-core \
python310-azure-nspkg \
python310-msrest \
python310-six"

inherit rpm
