SUMMARY = "Remote lookup tables for agate"
DESCRIPTION = "Agate-lookup adds one-line access to lookup tables to agate."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python39-agate-lookup-0.3.2-1.1.noarch.rpm"
RPM_HASH = "bcf20d74c191afd306b270f87f23c6271806cff6003aa361fdd24416f3144a82f7de52163d714386ab12a68710ba23632bcaff9bf8e0ee4e692925109a327b62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-agate-lookup \
python39-agate-lookup \
python3dist-agate-lookup"

RDEPENDS:${PN} += "python-abi \
python39-PyYAML \
python39-agate \
python39-requests"

inherit rpm
