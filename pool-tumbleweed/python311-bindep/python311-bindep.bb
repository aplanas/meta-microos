SUMMARY = "Binary dependency utility"
DESCRIPTION = "Bindep is a tool for checking the presence of binary packages needed to \
use an application / library. It started life as a way to make it easier to set \
up a development environment for OpenStack projects. While OpenStack depends \
heavily on `pip` for installation of Python dependencies, some dependencies are \
not Python based, and particularly for testing, some dependencies have to be \
installed before `pip` can be used - such as `virtualenv` and `pip` itself."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "python311-bindep-2.11.0-3.3.noarch.rpm"
RPM_HASH = "337ef637aa58905609fb51ac66565ede6a5a0fd69e8662e927fc9e41eb181f76dda3f6692fb71948d6209d9bed7acd8376858b1891597f39412c8b7bea143515"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bindep \
python3.11dist-bindep \
python311-bindep \
python3dist-bindep"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Parsley \
python311-distro \
python311-packaging \
python311-pbr"

inherit rpm
