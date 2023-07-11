SUMMARY = "A library for computing contrast ratios, as required by WCAG 20"
DESCRIPTION = "A library for computing contrast ratios, as required by WCAG 2.0"
LICENSE = "MIT"

PV = "0.9"

RPM_NAME = "python311-wcag-contrast-ratio-0.9-2.3.noarch.rpm"
RPM_HASH = "6225c831de26286c28d54b84536c26607ecc60f4f92caa4ebd682161c499cfe21da81c4935c0d3254cbcd89072452f2cf57f66bff0de9fb8bf3f9068e786e924"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wcag-contrast-ratio \
python3.11dist-wcag-contrast-ratio \
python311-wcag-contrast-ratio \
python3dist-wcag-contrast-ratio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
