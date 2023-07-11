SUMMARY = "A library for computing contrast ratios, as required by WCAG 20"
DESCRIPTION = "A library for computing contrast ratios, as required by WCAG 2.0"
LICENSE = "MIT"

PV = "0.9"

RPM_NAME = "python39-wcag-contrast-ratio-0.9-2.3.noarch.rpm"
RPM_HASH = "f3d74173c6bb99a83a0c3168a32f2ceab1bcbbb6fa2166b847bafa9c099d27c7be41cd28a795db48320d5fe1c37fe342890f1c2ba1097b2ab123d72e758b93a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-wcag-contrast-ratio \
python39-wcag-contrast-ratio \
python3dist-wcag-contrast-ratio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
