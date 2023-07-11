SUMMARY = "Simple app that provides django integration for RQ (Redis Queue)"
DESCRIPTION = "Django integration with RQ, a Redis based Python queuing library. \
Django-RQ is a simple app that allows you to configure your queues \
in django's settings.py and easily use them in your project."
LICENSE = "MIT"

PV = "2.8.1"

RPM_NAME = "python310-django-rq-2.8.1-1.3.noarch.rpm"
RPM_HASH = "05622298a8b7856d4aef0ad4ac0010834c46a01e71e5defb4c28300c0222d0a4489c1edc3b6ec3e671394eac18767ba40941a9f81ef377d3c2f6538cd505be92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-rq \
python310-django-rq \
python3dist-django-rq"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-rq"

inherit rpm
