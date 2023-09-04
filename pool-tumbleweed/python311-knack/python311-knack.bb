SUMMARY = "A Command-Line Interface framework"
DESCRIPTION = "A Command-Line Interface framework"
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python311-knack-0.11.0-1.1.noarch.rpm"
RPM_HASH = "ddeb84b2ac593e32452031526c4611db4bf9a96957a76b8c86c0c0aa493dfc83a4de36cec9d838ef01f071fdd405b0d2d1c6e2564cf1e6f4759cd665dd8f7b36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-knack \
python3.11dist-knack \
python311-knack \
python3dist-knack"

RDEPENDS:${PN} += "python-abi \
python311-PyYAML \
python311-argcomplete \
python311-jmespath \
python311-pygments \
python311-tabulate"

inherit rpm
