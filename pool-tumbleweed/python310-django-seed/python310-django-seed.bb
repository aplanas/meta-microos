SUMMARY = "Django project fake data seeder"
DESCRIPTION = "A module to seed Django projects with fake data."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python310-django-seed-0.2.2-2.7.noarch.rpm"
RPM_HASH = "259b88bacbd11d4349a7085f0d58256f049fa51d925c8f8c27f5a99900a97765ce08d4ad38e1a4391c655cdaafd37288639eda3dd1826a11051b981990e1a9dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-seed \
python3.10dist-django-seed \
python310-django-seed \
python3dist-django-seed"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-Faker"

inherit rpm
