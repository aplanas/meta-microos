SUMMARY = "Pytest plugin for coverage reporting"
DESCRIPTION = "This plugin produces coverage reports.  It supports centralised testing \
and distributed testing in both load and each modes.  It also supports \
coverage of subprocesses. \
 \
All features offered by the coverage package should be available, either \
through pytest-cov or through coverage's config file."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python310-pytest-cov-4.1.0-1.2.noarch.rpm"
RPM_HASH = "d8dd5feac15bd6da8226c16bac42cbaa38f6e3308ebf4e2582a2a820dfadaf9884ceeafaada775405215e78d5b86c4ef262c50acec0afba6f72f3a1fb1f7907e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-cov \
python310-pytest-cov \
python3dist-pytest-cov"

RDEPENDS:${PN} += "python-abi \
python310-coverage \
python310-pytest"

inherit rpm
