SUMMARY = "Pretty printer for pytest progress"
DESCRIPTION = "pytest-sugar is a plugin for py.test that shows failures and errors instantly and shows a progress bar."
LICENSE = "BSD-3-Clause"

PV = "0.9.7"

RPM_NAME = "python310-pytest-sugar-0.9.7-1.1.noarch.rpm"
RPM_HASH = "803409505ee0a70d02a9c752face96a8b8b28fb37e63288ed8952b246b339e5d3d3902c16693a48a63bc3f89a578bd08b8639fb79b25093db50fbf6a05f4b716"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-sugar \
python3.10dist(pytest-sugar) \
python310-pytest-sugar \
python3dist(pytest-sugar)"
RDEPENDS:${PN} += "python(abi) \
python310-pytest \
python310-termcolor"

inherit rpm
