SUMMARY = "Django project fake data seeder"
DESCRIPTION = "A module to seed Django projects with fake data."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python39-django-seed-0.2.2-2.9.noarch.rpm"
RPM_HASH = "19178a8c8bdcede095282e4b4b4b5a676f72e3b38304ec010d9311d9c670e4ae3abbff1ffe6f6efbbda9b7ee277ab47266cb155da351376e7d3cacd244121f5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-seed \
python39-django-seed \
python3dist-django-seed"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-Faker"

inherit rpm
