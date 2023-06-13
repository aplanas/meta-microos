SUMMARY = "Python package that generates fake data"
DESCRIPTION = "Faker is a Python package that generates fake data. It helps with \
database bootstrapping, creating XML documents, persistence stress \
testing, and data anonymization from production services."
LICENSE = "MIT"

PV = "18.9.0"

RPM_NAME = "python311-Faker-18.9.0-1.1.noarch.rpm"
RPM_HASH = "946262bc115a5ff8afcca21ecb23aa455fa578f3ed997cd583fe9fb38b7f3f8f5fb7f6631f1836b729d25ad2801ae176209abbe1bbd24e657d97ca67bb986418"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fake-factory \
python3.11dist(faker) \
python311-Faker \
python3dist(faker)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-python-dateutil \
python311-text-unidecode \
update-alternatives"

inherit rpm
