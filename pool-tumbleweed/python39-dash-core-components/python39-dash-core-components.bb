SUMMARY = "Core component suite for Dash - Legacy"
DESCRIPTION = "Core component suite for Dash \
 \
As of Dash 2, the development of dash-core-components has been moved to the main Dash repo \
 \
This package exists for backward compatibility as Dash still lists it as requirement. It \
has no further functionality than displaying a deprecation message."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-dash-core-components-2.0.0-1.6.noarch.rpm"
RPM_HASH = "9b30a4e3c9d2105a9ec00b967620042c595851d3895610b43f9700c36294ffb7af1afa31d139251f5e48d942517edfa6150059c977ab7d7f13a5e674f5d23f5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dash-core-components \
python39-dash-core-components \
python3dist-dash-core-components"

RDEPENDS:${PN} += "python-abi"

inherit rpm
