SUMMARY = "Middleware to protect against the BREACH attack in Django"
DESCRIPTION = "Adds middleware and context processors to give some protection against the BREACH attack in Django."
LICENSE = "BSD-2-Clause"

PV = "2.1.0"

RPM_NAME = "python310-django-debreach-2.1.0-1.15.noarch.rpm"
RPM_HASH = "1af86d720bf8fc258e52127e18108b4cdb8439d9694d7964e59d52c4003822998b6d0ba21c4717d9ce33db3f4f07a6b61125b178cd983c2d185c88992cf5624c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-debreach \
python310-django-debreach \
python3dist-django-debreach"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
