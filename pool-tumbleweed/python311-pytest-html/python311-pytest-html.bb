SUMMARY = "Pytest plugin for generating HTML reports"
DESCRIPTION = "A plugin for pytest that generates a HTML report for test results."
LICENSE = "MPL-2.0"

PV = "4.0.0rc5"

RPM_NAME = "python311-pytest-html-4.0.0rc5-1.1.noarch.rpm"
RPM_HASH = "6b794460e2bee8a914d2ea0ec362a174b7cfcf566d0e910daa594b2b31265183eca834a708836e00be86131467c6f22bed3982580e5f3058c30defe5f0dd0896"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-html \
python3.11dist-pytest-html \
python311-pytest-html \
python3dist-pytest-html"

RDEPENDS:${PN} += "python-abi \
python311-Jinja2 \
python311-pytest \
python311-pytest-metadata"

inherit rpm
