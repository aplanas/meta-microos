SUMMARY = "URL normalization for Python"
DESCRIPTION = "URL normalization for Python."
LICENSE = "MIT"

PV = "1.4.3"

RPM_NAME = "python311-url-normalize-1.4.3-2.3.noarch.rpm"
RPM_HASH = "7db3eacf448031d3ecebc213e6aaa2d1e4baad1d5a8a6b7b4aa15af628a2bdc034c2f2b2a23cc69a6511f8b68c66b4bc58dba5c37f2a1c0306f9152392ebb522"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-url-normalize \
python3.11dist-url-normalize \
python311-url-normalize \
python3dist-url-normalize"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
