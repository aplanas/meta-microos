SUMMARY = "A Command-Line Interface framework"
DESCRIPTION = "A Command-Line Interface framework"
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "python310-knack-0.10.1-1.5.noarch.rpm"
RPM_HASH = "930eb4d5ec9d028e33a4bcc0183b4754bebc757a6e8250dbf9e29b56f05fc1e887ef2737b1dd74e2ec721e1d4ecd727c29cba5e726b059aa1e7e85bc332bee0a"
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
