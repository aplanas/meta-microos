SUMMARY = "Python module to compress linked/inline JavaScript/CSS to cached files"
DESCRIPTION = "Django Compressor combines and compresses linked and inline Javascript or CSS \
in a Django templates into cacheable static files by using the 'compress' \
template tag."
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT"

PV = "4.4"

RPM_NAME = "python311-django-compressor-4.4-1.1.noarch.rpm"
RPM_HASH = "64ca76b3d0cf3ff55de0f52c6c4e4a73e6127c99c49c14ef30d67f956e6efe52829ff3c34269f2dd48d8e8ac3d5c1951276b4aa9923b85e76a44495192fcbca6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-compressor \
python3.11dist-django-compressor \
python311-django-compressor \
python3dist-django-compressor"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-Jinja2 \
python311-beautifulsoup4 \
python311-csscompressor \
python311-django-appconf \
python311-rcssmin \
python311-rjsmin \
python311-slimit"

inherit rpm
