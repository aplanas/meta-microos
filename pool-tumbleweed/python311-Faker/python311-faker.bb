SUMMARY = "Python package that generates fake data"
DESCRIPTION = "Faker is a Python package that generates fake data. It helps with \
database bootstrapping, creating XML documents, persistence stress \
testing, and data anonymization from production services."
LICENSE = "MIT"

PV = "18.11.1"

RPM_NAME = "python311-Faker-18.11.1-1.1.noarch.rpm"
RPM_HASH = "92caffcf557aad8a8ad1d5fd4aeba9a967d0ad84c1fb9d18f62fc2c0c542b0672ae19839f57b3919593908adf50c42921c2a3ffea0afc4bbc88d259f974f59ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Faker \
python3-fake-factory \
python3.11dist-faker \
python311-Faker \
python3dist-faker"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-python-dateutil \
python311-text-unidecode \
update-alternatives"

inherit rpm
