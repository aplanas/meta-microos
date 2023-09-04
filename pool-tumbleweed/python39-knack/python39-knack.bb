SUMMARY = "A Command-Line Interface framework"
DESCRIPTION = "A Command-Line Interface framework"
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python39-knack-0.11.0-1.1.noarch.rpm"
RPM_HASH = "3a6d5b4e600cf5bb5f219d1512891b00be2c5256159add9f3b1c53f50a4e43aaaad0f79591e312a365037922c3cd6378bfc9cf4bb7966e0f6615aaf7402e1b82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-knack \
python39-knack \
python3dist-knack"

RDEPENDS:${PN} += "python-abi \
python39-PyYAML \
python39-argcomplete \
python39-jmespath \
python39-pygments \
python39-tabulate"

inherit rpm
