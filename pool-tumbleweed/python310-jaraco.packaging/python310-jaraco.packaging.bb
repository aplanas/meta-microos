SUMMARY = "Supplement packaging Python releases"
DESCRIPTION = "Tools to supplement packaging Python releases."
LICENSE = "MIT"

PV = "9.2.0"

RPM_NAME = "python310-jaraco.packaging-9.2.0-1.3.noarch.rpm"
RPM_HASH = "a2d852dc176d146c3e4cc8393620669f7157ec0f1c648c25db36eecd585d31daa0c2935d26bb5dd043cafb57ddfffd97ac4467df5e6d2f560f47e8d6355fa61d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jaraco.packaging \
python310-jaraco.packaging \
python3dist-jaraco.packaging"

RDEPENDS:${PN} += "python-abi \
python310-build \
python310-jaraco.context \
python310-virtualenv"

inherit rpm
