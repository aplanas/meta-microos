SUMMARY = "OpenStackClient Library"
DESCRIPTION = "OpenStackClient (aka OSC) is a command-line client for OpenStack.  osc-lib \
is a package of common support modules for writing OSC plugins. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "2.7.0"

RPM_NAME = "python3-osc-lib-2.7.0-1.3.noarch.rpm"
RPM_HASH = "8fb35cdced11a4f31c24dccfce03a0980e7086a81b379e74606bee730c42dc4c5b3c7d754c42ba0ea6b369348f9e0250ac8a834fc75f163eb9a8770aeed549c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-osc-lib \
python3.11dist-osc-lib \
python3dist-osc-lib"

RDEPENDS:${PN} += "python-abi \
python3-cliff \
python3-keystoneauth1 \
python3-openstacksdk \
python3-oslo.i18n \
python3-oslo.utils \
python3-pbr \
python3-simplejson \
python3-six \
python3-stevedore"

inherit rpm
