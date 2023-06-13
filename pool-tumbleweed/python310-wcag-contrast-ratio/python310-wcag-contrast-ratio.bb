SUMMARY = "A library for computing contrast ratios, as required by WCAG 20"
DESCRIPTION = "A library for computing contrast ratios, as required by WCAG 2.0"
LICENSE = "MIT"

PV = "0.9"

RPM_NAME = "python310-wcag-contrast-ratio-0.9-2.1.noarch.rpm"
RPM_HASH = "a6d7256c669cc9d4ff6371193d4d0c6ba081ccfa19d94769826ba3fce4a7b6fe85ae0e3afe676e4489fa84f5340ae04b11168ce6c4a73bdcdede43e9e1f34d94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wcag-contrast-ratio \
python3.10dist(wcag-contrast-ratio) \
python310-wcag-contrast-ratio \
python3dist(wcag-contrast-ratio)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
