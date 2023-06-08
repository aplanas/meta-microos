SUMMARY = "A web interface to access GNU Mailman v3 archives"
DESCRIPTION = "A web interface to access GNU Mailman v3 archives."
LICENSE = "GPL-3.0-only"

PV = "1.3.5"

RPM_NAME = "HyperKitty-1.3.5-7.1.noarch.rpm"
RPM_HASH = "6445d5c2860891338c8ae9d49c025867c92027bd6c8bf4463b41de903220becfd537f60fac62f02ced7885cf867f55e564fd30cb6d7eb2446daf5223b2bc02d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "HyperKitty python3.9dist(hyperkitty) python39-HyperKitty python3dist(hyperkitty)"
RDEPENDS:${PN} += "python(abi) python39-Django python39-django-compressor python39-django-debug-toolbar python39-django-extensions python39-django-gravatar2 python39-django-haystack python39-django-mailman3 python39-django-q python39-djangorestframework python39-flufl.lock python39-libsass python39-mailmanclient python39-mistune python39-networkx python39-python-dateutil python39-pytz python39-robot-detection python39-xapian-haystack sassc"

inherit rpm
