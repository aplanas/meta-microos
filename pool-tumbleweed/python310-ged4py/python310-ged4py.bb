SUMMARY = "GEDCOM tools for Python"
DESCRIPTION = "GEDCOM tools for Python."
LICENSE = "MIT"

PV = "0.1.12"

RPM_NAME = "python310-ged4py-0.1.12-1.16.noarch.rpm"
RPM_HASH = "c441be718e1415319f2e4bec78cef81503b986174fc78f455b261ee9fa061e9882bfc693af0acb2ed01d013fd59661028a6fb2fcc3d2beb73ac9005d9e3aae83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ged4py \
python310-ged4py \
python3dist-ged4py"

RDEPENDS:${PN} += "python-abi \
python310-ansel"

inherit rpm
