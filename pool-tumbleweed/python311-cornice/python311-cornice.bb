SUMMARY = "Define Web Services in Pyramid"
DESCRIPTION = "Provides helpers to build & document Web Services with Pyramid."
LICENSE = "MPL-2.0"

PV = "6.0.1"

RPM_NAME = "python311-cornice-6.0.1-1.6.noarch.rpm"
RPM_HASH = "5dc86372185d386bafa629921b6a83beba65515f6e2bece9dcf2f9dac023adbbed822723e9d4daccb80bf9c7d119db1b45abb6964e11c598453fd4a203956072"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cornice) \
python311-cornice \
python3dist(cornice)"

RDEPENDS:${PN} += "python(abi) \
python311-pyramid \
python311-venusian"

inherit rpm
