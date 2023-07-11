SUMMARY = "A pure python RFC3339 validator"
DESCRIPTION = "A pure python RFC3339 validator"
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "python310-rfc3339-validator-0.1.4-3.3.noarch.rpm"
RPM_HASH = "8f68d5d4c03188c06d289f6734d49c9c94842d5f3e6515491a738ed7b98e2776c198d57d8e8ee9749140ddc5ea1ec89ed0b0e7c058aaa15dd45648bafeba7b0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rfc3339-validator \
python310-rfc3339-validator \
python3dist-rfc3339-validator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
