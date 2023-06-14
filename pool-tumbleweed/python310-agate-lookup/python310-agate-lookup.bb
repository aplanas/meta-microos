SUMMARY = "Remote lookup tables for agate"
DESCRIPTION = "Agate-lookup adds one-line access to lookup tables to agate."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python310-agate-lookup-0.3.1-2.7.noarch.rpm"
RPM_HASH = "b7f58e434d4da70613aa331e1d7644b2457c775660a93ba55edeffb2be65cabb28758f84ec7ff563e149d647c9b38f0bb186fd61acdb0eb55bd2eddda367eb11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-agate-lookup \
python3.10dist-agate-lookup \
python310-agate-lookup \
python3dist-agate-lookup"

RDEPENDS:${PN} += "python-abi \
python310-PyYAML \
python310-agate \
python310-requests"

inherit rpm
