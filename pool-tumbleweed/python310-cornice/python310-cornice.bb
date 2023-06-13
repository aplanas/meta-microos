SUMMARY = "Define Web Services in Pyramid"
DESCRIPTION = "Provides helpers to build & document Web Services with Pyramid."
LICENSE = "MPL-2.0"

PV = "6.0.1"

RPM_NAME = "python310-cornice-6.0.1-1.6.noarch.rpm"
RPM_HASH = "85317f384c8d8f967940d7395e3746f0b0e532f4e221ca095fd4fa483b2744c3a11915e7baf8d5a12357f17d7e8098914a6e559beaaf5d49f72502d175735217"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cornice \
python3.10dist(cornice) \
python310-cornice \
python3dist(cornice)"

RDEPENDS:${PN} += "python(abi) \
python310-pyramid \
python310-venusian"

inherit rpm
