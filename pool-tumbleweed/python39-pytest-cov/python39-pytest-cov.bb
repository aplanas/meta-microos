SUMMARY = "Pytest plugin for coverage reporting"
DESCRIPTION = "This plugin produces coverage reports.  It supports centralised testing \
and distributed testing in both load and each modes.  It also supports \
coverage of subprocesses. \
 \
All features offered by the coverage package should be available, either \
through pytest-cov or through coverage's config file."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python39-pytest-cov-4.1.0-1.1.noarch.rpm"
RPM_HASH = "955b2d9bbd4f5108149735995ac49866e3750ae730e7a882bf25ddf9d9c031e7ceace341f4f4afdcd28cd81d2e11b5e9faf88a419d09df5913e93f2eda5abc98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-cov) \
python39-pytest-cov \
python3dist(pytest-cov)"

RDEPENDS:${PN} += "python(abi) \
python39-coverage \
python39-pytest"

inherit rpm
