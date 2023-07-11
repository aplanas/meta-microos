SUMMARY = "Core component suite for Dash - Legacy"
DESCRIPTION = "Core component suite for Dash \
 \
As of Dash 2, the development of dash-core-components has been moved to the main Dash repo \
 \
This package exists for backward compatibility as Dash still lists it as requirement. It \
has no further functionality than displaying a deprecation message."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-dash-core-components-2.0.0-1.6.noarch.rpm"
RPM_HASH = "d4fc457f98f0b2923245f59e6e0c2fc74a30c8963508dec77dd2e5eb6b1593515933a9d31fc1ccfe95cecb44ce6acd32b3c4acfb580150d9f10e4e5a49fa2f33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dash-core-components \
python310-dash-core-components \
python3dist-dash-core-components"

RDEPENDS:${PN} += "python-abi"

inherit rpm
