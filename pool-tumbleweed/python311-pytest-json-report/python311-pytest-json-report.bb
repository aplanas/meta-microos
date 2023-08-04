SUMMARY = "A pytest plugin to report test results as JSON files"
DESCRIPTION = "A pytest plugin to report test results as JSON files"
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python311-pytest-json-report-1.5.0-2.1.noarch.rpm"
RPM_HASH = "4e299e88066a201dee3e3e0df17c8d9a913e223d816cdbf2b361a18182d508d9d103dd639407520415033085344b9831cdc4fb33256c1bd99044c41b05d4037a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-json-report \
python3.11dist-pytest-json-report \
python311-pytest-json-report \
python3dist-pytest-json-report"

RDEPENDS:${PN} += "python-abi \
python311-py \
python311-pytest \
python311-pytest-metadata"

inherit rpm
