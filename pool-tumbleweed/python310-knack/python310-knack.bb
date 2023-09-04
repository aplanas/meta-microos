SUMMARY = "A Command-Line Interface framework"
DESCRIPTION = "A Command-Line Interface framework"
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python310-knack-0.11.0-1.1.noarch.rpm"
RPM_HASH = "ccfe7c63a41c774a9c4ec73ef33b153bab9d9394f24c042723c727e12f885a3803ae3a7c6d8ce1c51e6c7cdbf20a47c56a657631887bd55b5ed4d185ce0d2c91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-knack \
python310-knack \
python3dist-knack"

RDEPENDS:${PN} += "python-abi \
python310-PyYAML \
python310-argcomplete \
python310-jmespath \
python310-pygments \
python310-tabulate"

inherit rpm
