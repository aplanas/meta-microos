SUMMARY = "More sophisticated version manipulation (than packaging)"
DESCRIPTION = "More sophisticated version manipulation (than packaging)"
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-jaraco.versioning-1.1.0-1.1.noarch.rpm"
RPM_HASH = "e0fcf54a3e3a4a9104b5ea3d63bf922ab2ef14f839acfca674623adbd6be2a1af4698b11b94b3854d14b26a35db30899325e0014cf609d288d38e69b19e2d325"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jaraco.versioning \
python310-jaraco.versioning \
python3dist-jaraco.versioning"

RDEPENDS:${PN} += "python-abi \
python310-packaging"

inherit rpm
