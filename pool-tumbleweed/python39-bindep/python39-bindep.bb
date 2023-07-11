SUMMARY = "Binary dependency utility"
DESCRIPTION = "Bindep is a tool for checking the presence of binary packages needed to \
use an application / library. It started life as a way to make it easier to set \
up a development environment for OpenStack projects. While OpenStack depends \
heavily on `pip` for installation of Python dependencies, some dependencies are \
not Python based, and particularly for testing, some dependencies have to be \
installed before `pip` can be used - such as `virtualenv` and `pip` itself."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "python39-bindep-2.11.0-3.3.noarch.rpm"
RPM_HASH = "a8314fd4064aff666f9e4b67c9ff65684c99cbdaea199914f951b7780a7bfc3b08fc9b3fdd18ffb245071737bf49d8257c580517e4b7dd5336fc4f66322d9c5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-bindep \
python39-bindep \
python3dist-bindep"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Parsley \
python39-distro \
python39-packaging \
python39-pbr"

inherit rpm
