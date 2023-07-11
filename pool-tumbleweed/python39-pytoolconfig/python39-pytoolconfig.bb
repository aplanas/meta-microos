SUMMARY = "Python tool configuration"
DESCRIPTION = "Python Tool Configuration \
 \
The goal of this project is to manage configuration for python tools, \
such as black and rope and add support for a pyproject.toml configuration file."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.4"

RPM_NAME = "python39-pytoolconfig-1.2.4-1.6.noarch.rpm"
RPM_HASH = "93642b3112cfe2217cdca2810028206055522879e9667c6822950902089263d938b40db63d279df2fc418e05225b9dd3668a0018fbf0a1449a1d2bda38a4a25f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytoolconfig \
python39-pytoolconfig \
python3dist-pytoolconfig"

RDEPENDS:${PN} += "python-abi \
python39-packaging \
python39-tomli"

inherit rpm
