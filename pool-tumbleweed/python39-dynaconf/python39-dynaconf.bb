SUMMARY = "The dynamic configurator for your Python Project"
DESCRIPTION = "The dynamic configurator for your Python Project"
LICENSE = "MIT"

PV = "3.1.11"

RPM_NAME = "python39-dynaconf-3.1.11-1.6.noarch.rpm"
RPM_HASH = "2273a401fc03f4418f5df5ba8262128a7cfc6897793f05374f7728d40518528e893c0970a0668c5a56d05e8de22cd41fa0a0e252b5b6034f45a3280e5dbf1733"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dynaconf \
python39-dynaconf \
python3dist-dynaconf"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyYAML \
python39-click \
python39-configobj \
python39-hvac \
python39-python-box \
python39-python-dotenv \
python39-redis \
python39-setuptools \
python39-toml \
update-alternatives"

inherit rpm
