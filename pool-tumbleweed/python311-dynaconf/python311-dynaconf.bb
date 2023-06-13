SUMMARY = "The dynamic configurator for your Python Project"
DESCRIPTION = "The dynamic configurator for your Python Project"
LICENSE = "MIT"

PV = "3.1.11"

RPM_NAME = "python311-dynaconf-3.1.11-1.4.noarch.rpm"
RPM_HASH = "819577a116f385f021a0626fb203f6d82f88627976681f3e2a2aee7ab1fae9512dc46f8172289cf4a40207340c0543a9583f2aa1b154d664ef0fe6470f599533"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(dynaconf) \
python311-dynaconf \
python3dist(dynaconf)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
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
