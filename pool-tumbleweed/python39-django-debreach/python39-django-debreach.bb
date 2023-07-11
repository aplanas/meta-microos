SUMMARY = "Middleware to protect against the BREACH attack in Django"
DESCRIPTION = "Adds middleware and context processors to give some protection against the BREACH attack in Django."
LICENSE = "BSD-2-Clause"

PV = "2.1.0"

RPM_NAME = "python39-django-debreach-2.1.0-1.15.noarch.rpm"
RPM_HASH = "4da75f055091e7e3591dc8d4429f209fd0a2648c79329b1336080973d349bca358753d8afda5665ccf36999f87ff88e3d5bc01637efa38c2cbdabe0061cdfa28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-debreach \
python39-django-debreach \
python3dist-django-debreach"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
