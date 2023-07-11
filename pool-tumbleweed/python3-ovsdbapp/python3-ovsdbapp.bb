SUMMARY = "A library for creating OVSDB applications"
DESCRIPTION = "The ovdsbapp library is useful for creating applications that communicate via \
Open_vSwitchs OVSDB protocol (https://tools.ietf.org/html/rfc7047). It wraps \
the Python 'ovs' and adds an event loop and friendly transactions."
LICENSE = "Apache-2.0"

PV = "2.3.0"

RPM_NAME = "python3-ovsdbapp-2.3.0-1.1.noarch.rpm"
RPM_HASH = "85eae122d1a2c08dfb29838f85adf2c328ac1d49cf03b71ca09330eeadfcfbd74ca553560a80de6065d967d8a25039fc1d696ed65821a8a1fceaeb81d2f164d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ovsdbapp \
python3.11dist-ovsdbapp \
python3dist-ovsdbapp"

RDEPENDS:${PN} += "python-abi \
python3-fixtures \
python3-netaddr \
python3-ovs \
python3-pbr \
python3-six"

inherit rpm
