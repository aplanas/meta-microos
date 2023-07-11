SUMMARY = "Pytest plugin for generating HTML reports"
DESCRIPTION = "A plugin for pytest that generates a HTML report for test results."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "python311-pytest-html-3.2.0-2.3.noarch.rpm"
RPM_HASH = "c372af0906f62130d59bd2c60d54b02a1e177bc96f5c25616aabdf7a2788f0dc4c6aca368e06b1687eba59d5d8358c0e175e6c4d3cff408948af04258f78fa4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-html \
python3.11dist-pytest-html \
python311-pytest-html \
python3dist-pytest-html"

RDEPENDS:${PN} += "python-abi \
python311-ansi2html \
python311-py \
python311-pytest \
python311-pytest-metadata"

inherit rpm
