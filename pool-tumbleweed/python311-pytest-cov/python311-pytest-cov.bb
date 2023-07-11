SUMMARY = "Pytest plugin for coverage reporting"
DESCRIPTION = "This plugin produces coverage reports.  It supports centralised testing \
and distributed testing in both load and each modes.  It also supports \
coverage of subprocesses. \
 \
All features offered by the coverage package should be available, either \
through pytest-cov or through coverage's config file."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python311-pytest-cov-4.1.0-1.2.noarch.rpm"
RPM_HASH = "3f9b4121eeb8eea1e25fce4479dbfe202ff60c9c12b2bce9fa9876c371b164165f102f2741640097d62697686eb6ad9eb10a9271a523f6a60718e5ec0e4c0fe9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-cov \
python3.11dist-pytest-cov \
python311-pytest-cov \
python3dist-pytest-cov"

RDEPENDS:${PN} += "python-abi \
python311-coverage \
python311-pytest"

inherit rpm
