SUMMARY = "Pytest plugin for coverage reporting"
DESCRIPTION = "This plugin produces coverage reports.  It supports centralised testing \
and distributed testing in both load and each modes.  It also supports \
coverage of subprocesses. \
 \
All features offered by the coverage package should be available, either \
through pytest-cov or through coverage's config file."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python39-pytest-cov-4.1.0-1.2.noarch.rpm"
RPM_HASH = "1a9f610fe2b2ff3211d35ec4adb7cb73efc72d29b2be7cb9553ea7cac998c2050535e99b3894daa8fa2073f7861e87ae39e93d8ba4e28ceb534a00852aeb770d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-cov \
python39-pytest-cov \
python3dist-pytest-cov"

RDEPENDS:${PN} += "python-abi \
python39-coverage \
python39-pytest"

inherit rpm
