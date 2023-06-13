SUMMARY = "Pytest plugin for generating HTML reports"
DESCRIPTION = "A plugin for pytest that generates a HTML report for test results."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "python310-pytest-html-3.2.0-2.1.noarch.rpm"
RPM_HASH = "06b8d52eeaed756e02071a0a431b2af7db992f0dd7fac0b1640e2b3c87004337fda677a251595475bd9766c7b176f138e7c6911db8c7bfe6953496b7edc908f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-html \
python3.10dist(pytest-html) \
python310-pytest-html \
python3dist(pytest-html)"

RDEPENDS:${PN} += "python(abi) \
python310-ansi2html \
python310-py \
python310-pytest \
python310-pytest-metadata"

inherit rpm
