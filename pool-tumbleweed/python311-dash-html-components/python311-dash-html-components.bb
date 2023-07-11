SUMMARY = "Vanilla HTML components for Dash - Legacy"
DESCRIPTION = "Vanilla HTML components for Dash \
 \
As of Dash 2, the development of dash-html-components has been moved to the main Dash repo \
 \
This package exists for backward compatibility as Dash still lists it as requirement. It \
has no further functionality than displaying a deprecation message."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-dash-html-components-2.0.0-1.6.noarch.rpm"
RPM_HASH = "1519d16918c36e1f580a29e611fbbfb0c531c6179409a86e170d0c41806889b5aa3d77395dcde2876d2d14cb395d66e6f5fb0691311b7887b749d76178d9c868"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dash-html-components \
python3.11dist-dash-html-components \
python311-dash-html-components \
python3dist-dash-html-components"

RDEPENDS:${PN} += "python-abi"

inherit rpm
