SUMMARY = "Django project fake data seeder"
DESCRIPTION = "A module to seed Django projects with fake data."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python311-django-seed-0.2.2-2.9.noarch.rpm"
RPM_HASH = "f4fa0e3c58c6e4f464a2ee35602ef2a6933b6590c0d1b4cd743542f5827809b2b1f4c9922750e0a2df14cae811e6d0227e6cd97f5f2f9c381a59f27835cdb865"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-seed \
python3.11dist-django-seed \
python311-django-seed \
python3dist-django-seed"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-Faker"

inherit rpm
