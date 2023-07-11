SUMMARY = "The dynamic configurator for your Python Project"
DESCRIPTION = "The dynamic configurator for your Python Project"
LICENSE = "MIT"

PV = "3.1.11"

RPM_NAME = "python311-dynaconf-3.1.11-1.6.noarch.rpm"
RPM_HASH = "1543b6fe93c4716d8d9d399fbd5cd609cac5764bf95f182cf061a93dfc1303a666aa5b87d7a9b23ed254585e0dc3066215ce9ce5eb71f682b9b0929dfc42db50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dynaconf \
python3.11dist-dynaconf \
python311-dynaconf \
python3dist-dynaconf"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyYAML \
python311-click \
python311-configobj \
python311-hvac \
python311-python-box \
python311-python-dotenv \
python311-redis \
python311-setuptools \
python311-toml \
update-alternatives"

inherit rpm
