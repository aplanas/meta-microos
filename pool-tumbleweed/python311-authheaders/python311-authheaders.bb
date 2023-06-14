SUMMARY = "A library wrapping email authentication header verification and generation"
DESCRIPTION = "A library wrapping email authentication header verification and generation."
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "python311-authheaders-0.14.1-1.6.noarch.rpm"
RPM_HASH = "926e4fb5888e6fa30c60401eb99911c31875789577a7c77c4df9061e2267388875c74f90f2ed0cb3d9c4d713ce6114ef9a188d04655bdd78a10ebe512c524c74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-authheaders \
python311-authheaders \
python3dist-authheaders"

RDEPENDS:${PN} += "python-abi \
python311-authres \
python311-dkimpy \
python311-dnspython \
python311-publicsuffix2"

inherit rpm
