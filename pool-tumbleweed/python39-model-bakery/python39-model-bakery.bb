SUMMARY = "Smart object creation facility for Django"
DESCRIPTION = "Smart object creation facility for Django."
LICENSE = "Apache-2.0"

PV = "1.9.0"

RPM_NAME = "python39-model-bakery-1.9.0-1.3.noarch.rpm"
RPM_HASH = "7972cd77324c91680eb72a5d904d4ae542e8663018c9a29de625c3cddb9abce1f1c6530ae069d0f32009816e629f1e663948fa6e760f7c1015bbbda203f28f0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-model-bakery \
python39-model-bakery \
python3dist-model-bakery"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
