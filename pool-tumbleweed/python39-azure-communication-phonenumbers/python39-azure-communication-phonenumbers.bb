SUMMARY = "Microsoft Azure Communication Phone Numbers Client Library for Python"
DESCRIPTION = "Azure Communication Phone Numbers Package client library for Python \
 \
Azure Communication Phone Numbers client package is used to administer Phone Numbers."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-azure-communication-phonenumbers-1.1.0-1.4.noarch.rpm"
RPM_HASH = "c86aabb5811df7e8b7b521bad025ba83659482a75b101380fa784c65c37b3d53e92b15d09baac1ed2ba2961c7c55618c399ce95933777a60c174ef6cbdc1db07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-communication-phonenumbers \
python39-azure-communication-phonenumbers \
python3dist-azure-communication-phonenumbers"

RDEPENDS:${PN} += "python-abi \
python39-azure-communication-nspkg \
python39-azure-core \
python39-azure-nspkg \
python39-msrest \
python39-six"

inherit rpm
