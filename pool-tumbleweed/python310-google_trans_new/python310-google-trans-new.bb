SUMMARY = "A free and unlimited python tools for google translate api"
DESCRIPTION = "This a free and unlimited python tools for google translate api."
LICENSE = "MIT"

PV = "1.1.9"

RPM_NAME = "python310-google_trans_new-1.1.9-2.1.noarch.rpm"
RPM_HASH = "f4fb1448be59d1d0b2eb51a8ecd0ae6608c0648dc20eeccfbe604fdd4fb875350d4491e8ab2ad45160b20f2b285e98bec6d97a59d19fa51f22076764a9954f42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-google-trans-new \
python310-google-trans-new \
python3dist-google-trans-new"

RDEPENDS:${PN} += "python-abi \
python310-requests \
python310-urllib3"

inherit rpm
