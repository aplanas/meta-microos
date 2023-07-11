SUMMARY = "Django project fake data seeder"
DESCRIPTION = "A module to seed Django projects with fake data."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python310-django-seed-0.2.2-2.9.noarch.rpm"
RPM_HASH = "88aa46d1bff303273d41d359b5990b1c2976c2381d3c944524f26bd295f257af1bb8f391da4c43c826397aa4ae44e94e4a706ad133cd6be7e6c8fa5c5ca0d2d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-seed \
python310-django-seed \
python3dist-django-seed"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-Faker"

inherit rpm
