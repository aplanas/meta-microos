SUMMARY = "Vanilla HTML components for Dash - Legacy"
DESCRIPTION = "Vanilla HTML components for Dash \
 \
As of Dash 2, the development of dash-html-components has been moved to the main Dash repo \
 \
This package exists for backward compatibility as Dash still lists it as requirement. It \
has no further functionality than displaying a deprecation message."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-dash-html-components-2.0.0-1.6.noarch.rpm"
RPM_HASH = "d6d31737fddb6b00dd2b0a65caf6904b6dd280a9a7e2a584c161319b8664d031378db78fe26237d8ebca444f4a7386c0f74b3c90f3175c5a1c4de6697603a24e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dash-html-components \
python310-dash-html-components \
python3dist-dash-html-components"

RDEPENDS:${PN} += "python-abi"

inherit rpm
