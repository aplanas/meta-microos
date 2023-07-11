SUMMARY = "Simple app that provides django integration for RQ (Redis Queue)"
DESCRIPTION = "Django integration with RQ, a Redis based Python queuing library. \
Django-RQ is a simple app that allows you to configure your queues \
in django's settings.py and easily use them in your project."
LICENSE = "MIT"

PV = "2.8.1"

RPM_NAME = "python311-django-rq-2.8.1-1.3.noarch.rpm"
RPM_HASH = "f971a7fdd6d333cff6b1528b77356b498f4f1dd25fb37738306765aaf56454a79b9f5f4e5e607a42da07ec077e42b413a2bf3aefcec82154e421c0cd1e1a2d86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-rq \
python3.11dist-django-rq \
python311-django-rq \
python3dist-django-rq"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-rq"

inherit rpm
