SUMMARY = "Core component suite for Dash - Legacy"
DESCRIPTION = "Core component suite for Dash \
 \
As of Dash 2, the development of dash-core-components has been moved to the main Dash repo \
 \
This package exists for backward compatibility as Dash still lists it as requirement. It \
has no further functionality than displaying a deprecation message."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-dash-core-components-2.0.0-1.6.noarch.rpm"
RPM_HASH = "e3312de6f3c3e33cc6ab6cfe79f58493bd025c0dae5aed6ca79a8b3ce1169331ce8b4147707302bb4cd5b40cabd07799dd341462f6e949a9366999fc27a5aaed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dash-core-components \
python3.11dist-dash-core-components \
python311-dash-core-components \
python3dist-dash-core-components"

RDEPENDS:${PN} += "python-abi"

inherit rpm
