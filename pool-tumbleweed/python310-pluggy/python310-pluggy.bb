SUMMARY = "A minimalist production ready plugin system"
DESCRIPTION = "This is the core framework used by the pytest, tox, and devpi projects."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-pluggy-1.0.0-2.1.noarch.rpm"
RPM_HASH = "64b25984c7ecb9d7c9ec2e1f293e7e3b36fc19e6f8bed9a969d527c23e5c6b5fa88824689e271472a32d45b3fb9a995f7ac7362e645c8635cd8abcea52010dc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pluggy \
python3.10dist-pluggy \
python310-pluggy \
python3dist-pluggy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
