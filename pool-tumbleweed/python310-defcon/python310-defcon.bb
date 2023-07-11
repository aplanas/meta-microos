SUMMARY = "A set of UFO based objects for use in font editing applications"
DESCRIPTION = "A set of UFO based objects optimized for use in font editing applications."
LICENSE = "MIT"

PV = "0.10.2"

RPM_NAME = "python310-defcon-0.10.2-1.5.noarch.rpm"
RPM_HASH = "388fcf96701e0be48bb99a96318ca00bdd45dea345d247d34c9e125dcc77e456b54cf961cea59134a13cdf6f5e98d4dfd5f9e161cf140b340173b39bba7e6131"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-defcon \
python310-defcon \
python3dist-defcon"

RDEPENDS:${PN} += "python-abi \
python310-FontTools \
python310-fs"

inherit rpm
