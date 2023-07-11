SUMMARY = "A web interface to access GNU Mailman v3 archives"
DESCRIPTION = "A web interface to access GNU Mailman v3 archives."
LICENSE = "GPL-3.0-only"

PV = "1.3.7"

RPM_NAME = "HyperKitty-1.3.7-1.1.noarch.rpm"
RPM_HASH = "95d7b2ddb7811c3b5d0281390761338159b1034442379da58872e3f075c98027f441f9e9b5642c89ab9045bf3ec29ccae63843350aeb40ba7c4c98804e288c0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "HyperKitty \
python3.9dist-hyperkitty \
python39-HyperKitty \
python3dist-hyperkitty"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-django-compressor \
python39-django-debug-toolbar \
python39-django-extensions \
python39-django-gravatar2 \
python39-django-haystack \
python39-django-mailman3 \
python39-django-q \
python39-djangorestframework \
python39-flufl.lock \
python39-libsass \
python39-mailmanclient \
python39-mistune \
python39-networkx \
python39-python-dateutil \
python39-pytz \
python39-robot-detection \
python39-xapian-haystack \
sassc"

inherit rpm
