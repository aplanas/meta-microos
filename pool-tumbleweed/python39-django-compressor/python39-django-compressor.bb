SUMMARY = "Python module to compress linked/inline JavaScript/CSS to cached files"
DESCRIPTION = "Django Compressor combines and compresses linked and inline Javascript or CSS \
in a Django templates into cacheable static files by using the 'compress' \
template tag."
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT"

PV = "4.3.1"

RPM_NAME = "python39-django-compressor-4.3.1-2.1.noarch.rpm"
RPM_HASH = "323aff916c6a1fcb0edf440bd3a166c715218b755994888b677bccc960c4f86d023844b93995103934896dca067ad1bcaa06575706c2c97fd53df6697c1680d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-compressor \
python39-django-compressor \
python3dist-django-compressor"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-Jinja2 \
python39-beautifulsoup4 \
python39-csscompressor \
python39-django-appconf \
python39-rcssmin \
python39-rjsmin \
python39-slimit"

inherit rpm
