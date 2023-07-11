SUMMARY = "The dynamic configurator for your Python Project"
DESCRIPTION = "The dynamic configurator for your Python Project"
LICENSE = "MIT"

PV = "3.1.11"

RPM_NAME = "python310-dynaconf-3.1.11-1.6.noarch.rpm"
RPM_HASH = "3e7c4c86b956c06e8859172ae0359f02f9a5d41c780e461923cdbfa9b5878f5730a6f6a9e455520d550082a47f8339afba155b0ae791d809ac75c247745fcf59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dynaconf \
python310-dynaconf \
python3dist-dynaconf"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyYAML \
python310-click \
python310-configobj \
python310-hvac \
python310-python-box \
python310-python-dotenv \
python310-redis \
python310-setuptools \
python310-toml \
update-alternatives"

inherit rpm
