SUMMARY = "Pytest plugin for generating HTML reports"
DESCRIPTION = "A plugin for pytest that generates a HTML report for test results."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "python39-pytest-html-3.2.0-2.1.noarch.rpm"
RPM_HASH = "b3ab26eb8bea3061ae19b6a603b25d562b8928f289ab728ece8acbf6daed9c3cab9357378d1828da9a07e1332001946bd40b1503dbe9f189ec98a8461562f850"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-html \
python39-pytest-html \
python3dist-pytest-html"

RDEPENDS:${PN} += "python-abi \
python39-ansi2html \
python39-py \
python39-pytest \
python39-pytest-metadata"

inherit rpm
