SUMMARY = "Python tool configuration"
DESCRIPTION = "Python Tool Configuration \
 \
The goal of this project is to manage configuration for python tools, \
such as black and rope and add support for a pyproject.toml configuration file."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.4"

RPM_NAME = "python39-pytoolconfig-1.2.4-1.4.noarch.rpm"
RPM_HASH = "a3c580f4d9fd8c157745666e78d1c5c616e7cb6784753c147da087e4a645ab59202ec392f29fc11c1dd18b48a737016b6f851aafceb6c5200ec43e5ec33dbe5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytoolconfig) \
python39-pytoolconfig \
python3dist(pytoolconfig)"

RDEPENDS:${PN} += "python(abi) \
python39-packaging \
python39-tomli"

inherit rpm
