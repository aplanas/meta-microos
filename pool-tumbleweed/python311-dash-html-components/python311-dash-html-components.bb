SUMMARY = "Vanilla HTML components for Dash - Legacy"
DESCRIPTION = "Vanilla HTML components for Dash \
 \
As of Dash 2, the development of dash-html-components has been moved to the main Dash repo \
 \
This package exists for backward compatibility as Dash still lists it as requirement. It \
has no further functionality than displaying a deprecation message."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-dash-html-components-2.0.0-1.5.noarch.rpm"
RPM_HASH = "68bdbf025a1d5b760e1f4c1fdf44cdc27ec558136e00ee3f8acf6f772ca46c097e7b70ee6fd8bcba6c0f939ad53ce070b7bdd0f9cabe7ad84b5181fd6bdc7e64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(dash-html-components) \
python311-dash-html-components \
python3dist(dash-html-components)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
