SUMMARY = "Classes implementing the SARIF 2.1.0 object model"
DESCRIPTION = "Classes implementing the SARIF 2.1.0 object model."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python39-sarif-om-1.0.4-2.3.noarch.rpm"
RPM_HASH = "9d51a7379ea33dc09880f83a453e52cd64df1b9f858c161c656cc7b3b766c77b911ce8b60944b09e6f726ac591a8a47fd3f6aed33e470fc90fd463e1fc60bdf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sarif-om \
python39-sarif-om \
python3dist-sarif-om"

RDEPENDS:${PN} += "python-abi \
python39-attrs \
python39-pbr"

inherit rpm
