SUMMARY = "A library for managing DNS zones"
DESCRIPTION = "A simple library for managing DNS zones."
LICENSE = "BSD-3-Clause"

PV = "0.9.8"

RPM_NAME = "python310-localzone-0.9.8-2.1.noarch.rpm"
RPM_HASH = "065aa959051859522c81113f97148921e1a18b5dfb00b58afe58ed19c75816a4ace2e6790d445354905b50023c9fffbd819348a65bd359007d3bafe45b201ca0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-localzone \
python310-localzone \
python3dist-localzone"

RDEPENDS:${PN} += "python-abi \
python310-dnspython"

inherit rpm
