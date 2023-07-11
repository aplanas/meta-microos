SUMMARY = "Middleware to protect against the BREACH attack in Django"
DESCRIPTION = "Adds middleware and context processors to give some protection against the BREACH attack in Django."
LICENSE = "BSD-2-Clause"

PV = "2.1.0"

RPM_NAME = "python311-django-debreach-2.1.0-1.15.noarch.rpm"
RPM_HASH = "7d55527ae1412cd5a334d663c005a7951185a6065210455881e764a5cfda6802b016dc5a781be7ad0093ec4daf103457304f874afdfb606b53a527fe0b2dee10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-debreach \
python3.11dist-django-debreach \
python311-django-debreach \
python3dist-django-debreach"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
