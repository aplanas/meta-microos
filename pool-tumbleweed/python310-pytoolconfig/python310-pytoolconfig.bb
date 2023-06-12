SUMMARY = "Python tool configuration"
DESCRIPTION = "Python Tool Configuration \
 \
The goal of this project is to manage configuration for python tools, \
such as black and rope and add support for a pyproject.toml configuration file."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.4"

RPM_NAME = "python310-pytoolconfig-1.2.4-1.4.noarch.rpm"
RPM_HASH = "3bf1c8b0e44d9a46b97e93dfa9748dcff909a485fc283a5814e96b806ded0f24e3520524046d6de03ba2bf13b68b09caa0b1b083591134366debd3a6dd8a5c8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytoolconfig \
python3.10dist(pytoolconfig) \
python310-pytoolconfig \
python3dist(pytoolconfig)"
RDEPENDS:${PN} += "python(abi) \
python310-packaging \
python310-tomli"

inherit rpm
