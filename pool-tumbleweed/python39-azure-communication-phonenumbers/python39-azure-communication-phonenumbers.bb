SUMMARY = "Microsoft Azure Communication Phone Numbers Client Library for Python"
DESCRIPTION = "Azure Communication Phone Numbers Package client library for Python \
 \
Azure Communication Phone Numbers client package is used to administer Phone Numbers."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-azure-communication-phonenumbers-1.1.0-1.2.noarch.rpm"
RPM_HASH = "22d65f7188fed7620c572ff2c3c6f26f351831fbc23c1ee5c5bd36161871168a70c4f60e98a16cbc2f55a85d4e5791a5742735809525b104e1e1f5616566bc66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-communication-phonenumbers) \
python39-azure-communication-phonenumbers \
python3dist(azure-communication-phonenumbers)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-communication-nspkg \
python39-azure-core \
python39-azure-nspkg \
python39-msrest \
python39-six"

inherit rpm
