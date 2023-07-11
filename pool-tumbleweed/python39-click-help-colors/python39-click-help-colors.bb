SUMMARY = "Colorization of help messages in Click"
DESCRIPTION = "Colorization of help messages in Click"
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python39-click-help-colors-0.9.1-2.3.noarch.rpm"
RPM_HASH = "ea5f30e9e09b119a8e86ae9a9194b62d087116418f788d67fbeb03a5aca2fc4a8e9bcbe430d9e34d7e4767d1900b0316a685607e22d93d92812e6b9ada476c01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-click-help-colors \
python39-click-help-colors \
python3dist-click-help-colors"

RDEPENDS:${PN} += "python-abi \
python39-click"

inherit rpm
