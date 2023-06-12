SUMMARY = "Python module to compress linked/inline JavaScript/CSS to cached files"
DESCRIPTION = "Django Compressor combines and compresses linked and inline Javascript or CSS \
in a Django templates into cacheable static files by using the 'compress' \
template tag."
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT"

PV = "4.3.1"

RPM_NAME = "python39-django-compressor-4.3.1-1.4.noarch.rpm"
RPM_HASH = "b5cf0e0514e49f6d49c9a754a2d1ffb4cc1b02384ab12a205ca0cf318ef4e66ba44d0cbbde57bf2c8656236a51ceb0c3d0d764ba4284282fc7690b4e678407c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-compressor) \
python39-django-compressor \
python39-django_compressor \
python3dist(django-compressor)"
RDEPENDS:${PN} += "python(abi) \
python39-Django \
python39-Jinja2 \
python39-beautifulsoup4 \
python39-csscompressor \
python39-django-appconf \
python39-rcssmin \
python39-rjsmin \
python39-slimit"

inherit rpm
