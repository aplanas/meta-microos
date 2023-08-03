SUMMARY = "Pytest plugin for test session metadata"
DESCRIPTION = "Pytest plugin for test session metadata."
LICENSE = "MPL-2.0"

PV = "3.0.0"

RPM_NAME = "python310-pytest-metadata-3.0.0-1.1.noarch.rpm"
RPM_HASH = "d223a37ac7f87717d379f6816cea64ba30984cabc98a30fa861d29f61e8260b52f890123af73ab04ffd04dc6547e53daef97d5ce5e07d20ad34e6ddfc1bd8258"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-metadata \
python310-pytest-metadata \
python3dist-pytest-metadata"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
