SUMMARY = "Simple app that provides django integration for RQ (Redis Queue)"
DESCRIPTION = "Django integration with RQ, a Redis based Python queuing library. \
Django-RQ is a simple app that allows you to configure your queues \
in django's settings.py and easily use them in your project."
LICENSE = "MIT"

PV = "2.8.0"

RPM_NAME = "python311-django-rq-2.8.0-1.1.noarch.rpm"
RPM_HASH = "979f71de12011dcf391ce5bb8efe073f0673ebb970288e6c0a6db1569cecad8a3749de7efd282e809dc0af1958d501b9faf0c47d68f71ec4145e1333b21ad495"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-django-rq \
python311-django-rq \
python3dist-django-rq"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-rq"

inherit rpm
