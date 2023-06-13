SUMMARY = "A library for computing contrast ratios, as required by WCAG 20"
DESCRIPTION = "A library for computing contrast ratios, as required by WCAG 2.0"
LICENSE = "MIT"

PV = "0.9"

RPM_NAME = "python311-wcag-contrast-ratio-0.9-2.1.noarch.rpm"
RPM_HASH = "615e0a1f072d9502b426f07fc2b5ed1bc7fccfe96bccda6e9802b4f1941fb752f3f26f49cd23e66d6946b94e6e1b91440a8d1b66b68261f1f9ab41a5ab0654c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(wcag-contrast-ratio) \
python311-wcag-contrast-ratio \
python3dist(wcag-contrast-ratio)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
