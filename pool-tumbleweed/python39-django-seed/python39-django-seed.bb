SUMMARY = "Django project fake data seeder"
DESCRIPTION = "A module to seed Django projects with fake data."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python39-django-seed-0.2.2-2.7.noarch.rpm"
RPM_HASH = "cf50860a2834f62651df77b3bb35c8c5a30bd394807cbbd335719a39e861e0950387681676ba9b223b8eed95b5bb7db97fc36bef3aa58a9d3ad0c6de4db8c591"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-seed) \
python39-django-seed \
python3dist(django-seed)"

RDEPENDS:${PN} += "python(abi) \
python39-Django \
python39-Faker"

inherit rpm
