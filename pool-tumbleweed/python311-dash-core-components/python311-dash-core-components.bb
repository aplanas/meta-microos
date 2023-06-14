SUMMARY = "Core component suite for Dash - Legacy"
DESCRIPTION = "Core component suite for Dash \
 \
As of Dash 2, the development of dash-core-components has been moved to the main Dash repo \
 \
This package exists for backward compatibility as Dash still lists it as requirement. It \
has no further functionality than displaying a deprecation message."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-dash-core-components-2.0.0-1.5.noarch.rpm"
RPM_HASH = "14264ad507e8464b35f87acd2edb6b2142f9b944b5b9299d070fc2a182c8990fba59b25a3fd56b3faed63e46ec73bb0a3baf801eff1dd0e4d7d877d531c12a13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-dash-core-components \
python311-dash-core-components \
python3dist-dash-core-components"

RDEPENDS:${PN} += "python-abi"

inherit rpm
