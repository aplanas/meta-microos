SUMMARY = "A library for creating OVSDB applications"
DESCRIPTION = "The ovdsbapp library is useful for creating applications that communicate via \
Open_vSwitchs OVSDB protocol (https://tools.ietf.org/html/rfc7047). It wraps \
the Python 'ovs' and adds an event loop and friendly transactions."
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "python3-ovsdbapp-2.2.1-1.2.noarch.rpm"
RPM_HASH = "3598d73d7676bdec9e228571d91c80c5d15b6f768c8b8a8e195e4fa06128a35c3c11896d05b02e72a791a4d22094d9efdb3b50ae91f55d869c5d19ffbbacaa2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ovsdbapp \
python3.10dist-ovsdbapp \
python3dist-ovsdbapp"

RDEPENDS:${PN} += "python-abi \
python3-fixtures \
python3-netaddr \
python3-ovs \
python3-pbr \
python3-six"

inherit rpm
