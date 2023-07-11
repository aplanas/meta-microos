SUMMARY = "A library for computing contrast ratios, as required by WCAG 20"
DESCRIPTION = "A library for computing contrast ratios, as required by WCAG 2.0"
LICENSE = "MIT"

PV = "0.9"

RPM_NAME = "python310-wcag-contrast-ratio-0.9-2.3.noarch.rpm"
RPM_HASH = "4ff3188c10c3d654639f108248593650ce2e3a5649dd9d4cce143010bed4dd8bfd2cce20379d5fc1d300dab45bbed7eb255b5ce6e3a1d7c76a447d5a392d87ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-wcag-contrast-ratio \
python310-wcag-contrast-ratio \
python3dist-wcag-contrast-ratio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
