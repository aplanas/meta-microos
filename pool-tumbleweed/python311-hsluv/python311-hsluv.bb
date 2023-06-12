SUMMARY = "Human-friendly HSL"
DESCRIPTION = "Human-friendly HSL"
LICENSE = "MIT"

PV = "5.0.3"

RPM_NAME = "python311-hsluv-5.0.3-1.2.noarch.rpm"
RPM_HASH = "6d45bb08c8739ca94a9ac8bc636a59a1ecfbb05024181a876ebc149be7f8ca0283d65124dc80dea62584c7bc099a973d65a048c8b5458132c75983cc4758313b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(hsluv) \
python311-hsluv \
python3dist(hsluv)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
