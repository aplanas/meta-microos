SUMMARY = "Python module to compress linked/inline JavaScript/CSS to cached files"
DESCRIPTION = "Django Compressor combines and compresses linked and inline Javascript or CSS \
in a Django templates into cacheable static files by using the 'compress' \
template tag."
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT"

PV = "4.3.1"

RPM_NAME = "python310-django-compressor-4.3.1-2.1.noarch.rpm"
RPM_HASH = "25b2f0c170fec7cea4742d7da74d038447b8a21d0f9dfdf0cffac45bd6b85428c5b32c54fab33a2718eaf7248e0da3ee167615686ed4e1cf9e053db64be8cdae"
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
