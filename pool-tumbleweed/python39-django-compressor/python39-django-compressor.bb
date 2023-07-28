SUMMARY = "Python module to compress linked/inline JavaScript/CSS to cached files"
DESCRIPTION = "Django Compressor combines and compresses linked and inline Javascript or CSS \
in a Django templates into cacheable static files by using the 'compress' \
template tag."
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT"

PV = "4.4"

RPM_NAME = "python39-django-compressor-4.4-1.1.noarch.rpm"
RPM_HASH = "c0da2d7749abf09ea4aa6ff3ca7d0445cffc70e0bc3d5fc7590e047f28ad778fe44d2bde5baf523850e76e9ece928a07e90edcc89582eb2e2011c751ab073a18"
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
