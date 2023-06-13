SUMMARY = "Pytest plugin for generating HTML reports"
DESCRIPTION = "A plugin for pytest that generates a HTML report for test results."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "python311-pytest-html-3.2.0-2.1.noarch.rpm"
RPM_HASH = "45b0e2b288de304c6949062c1cbadf933bc5d44a12cce463d2dccba41846ec3e3ed8ab417167fa747bab761e33b2888269648b571afbca27c3e09afa192dedfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-html) \
python311-pytest-html \
python3dist(pytest-html)"

RDEPENDS:${PN} += "python(abi) \
python311-ansi2html \
python311-py \
python311-pytest \
python311-pytest-metadata"

inherit rpm
