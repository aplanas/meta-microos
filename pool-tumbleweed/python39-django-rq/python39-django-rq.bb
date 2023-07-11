SUMMARY = "Simple app that provides django integration for RQ (Redis Queue)"
DESCRIPTION = "Django integration with RQ, a Redis based Python queuing library. \
Django-RQ is a simple app that allows you to configure your queues \
in django's settings.py and easily use them in your project."
LICENSE = "MIT"

PV = "2.8.1"

RPM_NAME = "python39-django-rq-2.8.1-1.3.noarch.rpm"
RPM_HASH = "16e6d3ab8b6034ccbc112634088d0b6e90f9ac61c55801b387009949d5c451008b10e9bd041b36d32dc8c36c8797f70e4bb76296c17dd3d2322f1429c5054d7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-rq \
python39-django-rq \
python3dist-django-rq"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-rq"

inherit rpm
