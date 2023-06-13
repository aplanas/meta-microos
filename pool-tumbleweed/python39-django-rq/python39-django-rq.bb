SUMMARY = "Simple app that provides django integration for RQ (Redis Queue)"
DESCRIPTION = "Django integration with RQ, a Redis based Python queuing library. \
Django-RQ is a simple app that allows you to configure your queues \
in django's settings.py and easily use them in your project."
LICENSE = "MIT"

PV = "2.8.0"

RPM_NAME = "python39-django-rq-2.8.0-1.1.noarch.rpm"
RPM_HASH = "d117bf4f7d006d991eadc1ba246e02abd154687ebd2894659e8a1ce8bf7353a9150de3aea004529024ce0c788f81130eb724e623dc22c1f0f8d84b9927c46715"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-rq) \
python39-django-rq \
python3dist(django-rq)"

RDEPENDS:${PN} += "python(abi) \
python39-Django \
python39-rq"

inherit rpm
