SUMMARY = "Define Web Services in Pyramid"
DESCRIPTION = "Provides helpers to build & document Web Services with Pyramid."
LICENSE = "MPL-2.0"

PV = "6.0.1"

RPM_NAME = "python39-cornice-6.0.1-1.6.noarch.rpm"
RPM_HASH = "fd59d7de8d325eadbcd94cc93fd5c554f8ef84f0e70ffbcb9a24cfe3882ecee42a9f7e723afc8513d2b8975b5261d0930bfa663ff53db47b26604619fe7d7c6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cornice) \
python39-cornice \
python3dist(cornice)"

RDEPENDS:${PN} += "python(abi) \
python39-pyramid \
python39-venusian"

inherit rpm
