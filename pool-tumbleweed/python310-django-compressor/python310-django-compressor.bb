SUMMARY = "Python module to compress linked/inline JavaScript/CSS to cached files"
DESCRIPTION = "Django Compressor combines and compresses linked and inline Javascript or CSS \
in a Django templates into cacheable static files by using the 'compress' \
template tag."
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT"

PV = "4.4"

RPM_NAME = "python310-django-compressor-4.4-1.1.noarch.rpm"
RPM_HASH = "1899f58230a37e44442d2dad17e2347e8c4ebe3147496d279e2479bcdd9424d89740eb1369750ce0019b4ccee0d95080ea2ad82c5817003496f58328417bdda5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-compressor \
python310-django-compressor \
python3dist-django-compressor"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-Jinja2 \
python310-beautifulsoup4 \
python310-csscompressor \
python310-django-appconf \
python310-rcssmin \
python310-rjsmin \
python310-slimit"

inherit rpm
