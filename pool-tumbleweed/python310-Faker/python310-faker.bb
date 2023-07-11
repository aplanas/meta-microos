SUMMARY = "Python package that generates fake data"
DESCRIPTION = "Faker is a Python package that generates fake data. It helps with \
database bootstrapping, creating XML documents, persistence stress \
testing, and data anonymization from production services."
LICENSE = "MIT"

PV = "18.11.1"

RPM_NAME = "python310-Faker-18.11.1-1.1.noarch.rpm"
RPM_HASH = "3f9d2e37e58b5e8471063f7a9e9d0109472e78ef49ba223bd6f38aeb01156e6a66c46150c71d26dc501891e162b4cf5e2450b4417a422e1ec99f60d5faadf7ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fake-factory \
python3.10dist-faker \
python310-Faker \
python3dist-faker"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-python-dateutil \
python310-text-unidecode \
update-alternatives"

inherit rpm
