SUMMARY = "Python module to compress linked/inline JavaScript/CSS to cached files"
DESCRIPTION = "Django Compressor combines and compresses linked and inline Javascript or CSS \
in a Django templates into cacheable static files by using the 'compress' \
template tag."
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT"

PV = "4.3.1"

RPM_NAME = "python310-django-compressor-4.3.1-1.4.noarch.rpm"
RPM_HASH = "056216d3d91e6a12a2e1c2c5588de561fcd7a04c01025f8c185276c2b9f61bae81683c40c4609bd328968040a005739b838bf53c9dc6a72a112c9adc05206924"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-compressor \
python3.10dist-django-compressor \
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
