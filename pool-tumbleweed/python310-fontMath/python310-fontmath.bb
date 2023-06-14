SUMMARY = "A set of objects for performing math operations on font data"
DESCRIPTION = "A set of objects for performing math operations on font data."
LICENSE = "MIT"

PV = "0.9.3"

RPM_NAME = "python310-fontMath-0.9.3-1.3.noarch.rpm"
RPM_HASH = "82cb259a418acfeff1ff75de196d5afb9e7d8e303941a8137b0d000ea3f0f7c17d9b1b445a8dcde36c072232463c40450170b2ace4d663db1194959d255ad476"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fontMath \
python3.10dist-fontmath \
python310-fontMath \
python3dist-fontmath"

RDEPENDS:${PN} += "python-abi \
python310-FontTools"

inherit rpm
