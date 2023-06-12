SUMMARY = "Binary dependency utility"
DESCRIPTION = "Bindep is a tool for checking the presence of binary packages needed to \
use an application / library. It started life as a way to make it easier to set \
up a development environment for OpenStack projects. While OpenStack depends \
heavily on `pip` for installation of Python dependencies, some dependencies are \
not Python based, and particularly for testing, some dependencies have to be \
installed before `pip` can be used - such as `virtualenv` and `pip` itself."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "python311-bindep-2.11.0-3.1.noarch.rpm"
RPM_HASH = "019403e8f6fdb4081cac16f8e37d516b79641972e3d71f5f4df9411ce389afd5fba38487961d9fc1cb3ec6d59bc129d07710deb57b993679f8d29bc7f15d3c58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(bindep) \
python311-bindep \
python3dist(bindep)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-Parsley \
python311-distro \
python311-packaging \
python311-pbr"

inherit rpm
