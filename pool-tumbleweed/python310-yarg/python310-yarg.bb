SUMMARY = "A PyPI client"
DESCRIPTION = "A PyPI client."
LICENSE = "MIT"

PV = "0.1.9"

RPM_NAME = "python310-yarg-0.1.9-2.8.noarch.rpm"
RPM_HASH = "d56d350f9abb4218f59b616b78467595c9e5f5527d048cbe757bf49f94c1d43ee013bd3ab291ab8a55761cbb9d4109aa90e83b00d0390c148bd458a29b452523"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yarg \
python3.10dist(yarg) \
python310-yarg \
python3dist(yarg)"

RDEPENDS:${PN} += "python(abi) \
python310-requests"

inherit rpm
