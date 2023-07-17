SUMMARY = "A web interface to access GNU Mailman v3 archives"
DESCRIPTION = "A web interface to access GNU Mailman v3 archives."
LICENSE = "GPL-3.0-only"

PV = "1.3.7"

RPM_NAME = "HyperKitty-1.3.7-2.1.noarch.rpm"
RPM_HASH = "073611346b1b6a9ea59c1229300ecfb71d5f5597aeb198b17d35b98578504389ddd45398fd6a963966a5bf80555210cc1a8ab297dd5a9310892b338476381249"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "HyperKitty \
python3-HyperKitty \
python3.11dist-hyperkitty \
python311-HyperKitty \
python3dist-hyperkitty"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-Whoosh \
python311-django-compressor \
python311-django-debug-toolbar \
python311-django-extensions \
python311-django-gravatar2 \
python311-django-haystack \
python311-django-mailman3 \
python311-django-q \
python311-djangorestframework \
python311-flufl.lock \
python311-libsass \
python311-mailmanclient \
python311-mistune \
python311-networkx \
python311-python-dateutil \
python311-pytz \
python311-robot-detection \
python311-xapian-haystack \
sassc"

inherit rpm
