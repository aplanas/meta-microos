SUMMARY = "Python package that generates fake data"
DESCRIPTION = "Faker is a Python package that generates fake data. It helps with \
database bootstrapping, creating XML documents, persistence stress \
testing, and data anonymization from production services."
LICENSE = "MIT"

PV = "18.11.1"

RPM_NAME = "python39-Faker-18.11.1-1.1.noarch.rpm"
RPM_HASH = "59d6dfc7d0e5e8523cee11df220b496998bd461f6419038775ba0ad34e39c89ef5ade98f0c869243b5c277f85dd92ceacf355f298c95dd0684f84942f1b02f89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fake-factory \
python3.9dist-faker \
python39-Faker \
python3dist-faker"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-python-dateutil \
python39-text-unidecode \
update-alternatives"

inherit rpm
