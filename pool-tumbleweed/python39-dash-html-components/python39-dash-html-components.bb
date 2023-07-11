SUMMARY = "Vanilla HTML components for Dash - Legacy"
DESCRIPTION = "Vanilla HTML components for Dash \
 \
As of Dash 2, the development of dash-html-components has been moved to the main Dash repo \
 \
This package exists for backward compatibility as Dash still lists it as requirement. It \
has no further functionality than displaying a deprecation message."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-dash-html-components-2.0.0-1.6.noarch.rpm"
RPM_HASH = "b6ab16943152157c6493973f6e8855fb4683e7ba1f75be0a9797ccd109cae07d17862d4377ff27c0017e3f75652d12613ed5cd64984caa14fb0815217a4618ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dash-html-components \
python39-dash-html-components \
python3dist-dash-html-components"

RDEPENDS:${PN} += "python-abi"

inherit rpm
