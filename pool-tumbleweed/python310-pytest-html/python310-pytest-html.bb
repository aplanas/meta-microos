SUMMARY = "Pytest plugin for generating HTML reports"
DESCRIPTION = "A plugin for pytest that generates a HTML report for test results."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "python310-pytest-html-3.2.0-2.3.noarch.rpm"
RPM_HASH = "05e45abd3756741627b2797ef073b5c501d6524128e6b3027ba8aae516c076360fffe31060e28c1c5dc0519abaf0ea4d2f728d3ac203ee123d262787a4618e50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-html \
python310-pytest-html \
python3dist-pytest-html"

RDEPENDS:${PN} += "python-abi \
python310-ansi2html \
python310-py \
python310-pytest \
python310-pytest-metadata"

inherit rpm
