SUMMARY = "Binary dependency utility"
DESCRIPTION = "Bindep is a tool for checking the presence of binary packages needed to \
use an application / library. It started life as a way to make it easier to set \
up a development environment for OpenStack projects. While OpenStack depends \
heavily on `pip` for installation of Python dependencies, some dependencies are \
not Python based, and particularly for testing, some dependencies have to be \
installed before `pip` can be used - such as `virtualenv` and `pip` itself."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "python310-bindep-2.11.0-3.3.noarch.rpm"
RPM_HASH = "0998ffb3c46d53c52d6f19403521a4aac180fb985556297d6f329c5d160d587e321293e286a320d94f071e9d60105ea62a54cb21e1f6c209fc6447782cfcc093"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-bindep \
python310-bindep \
python3dist-bindep"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Parsley \
python310-distro \
python310-packaging \
python310-pbr"

inherit rpm
