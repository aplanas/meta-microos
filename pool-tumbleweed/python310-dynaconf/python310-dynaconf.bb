SUMMARY = "The dynamic configurator for your Python Project"
DESCRIPTION = "The dynamic configurator for your Python Project"
LICENSE = "MIT"

PV = "3.1.11"

RPM_NAME = "python310-dynaconf-3.1.11-1.4.noarch.rpm"
RPM_HASH = "6fcd206143a0ecf4288b3171c07595183dd93430c44d34be0ae0744d419350f992f8a1f5335d14fb667eb3103a444831c12b003de7abb4d215f4a351ddbccea1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dynaconf \
python3.10dist(dynaconf) \
python310-dynaconf \
python3dist(dynaconf)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
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
