SUMMARY = "Python API and CLI for OpenStack Masakari"
DESCRIPTION = "Client library for Masakari built on the Masakari API. It provides a Python API \
(the masakariclient module) and a command-line tool (masakari). \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "7.1.0"

RPM_NAME = "python3-masakariclient-7.1.0-1.4.noarch.rpm"
RPM_HASH = "222b360c1a9aa417dbfbcbd8f04e4f50fe5ef52a51ebff2d7ac52c15436b4a30c3b95c42c7fdb8cac77f2c1c45fe2e4408e3921fb509d93ff0fbbd16cb39d774"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-masakariclient \
python3.10dist(python-masakariclient) \
python3dist(python-masakariclient)"

RDEPENDS:${PN} += "python(abi) \
python3-openstacksdk \
python3-oslo.i18n \
python3-oslo.serialization \
python3-oslo.utils \
python3-pbr"

inherit rpm
