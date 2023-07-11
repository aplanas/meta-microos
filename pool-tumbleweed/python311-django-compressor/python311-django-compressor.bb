SUMMARY = "Python module to compress linked/inline JavaScript/CSS to cached files"
DESCRIPTION = "Django Compressor combines and compresses linked and inline Javascript or CSS \
in a Django templates into cacheable static files by using the 'compress' \
template tag."
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT"

PV = "4.3.1"

RPM_NAME = "python311-django-compressor-4.3.1-2.1.noarch.rpm"
RPM_HASH = "1cd72a237b12adeaa1051508ee8b8bb4f70fd6de2f951c2a868ac0db3e55f07844c7be0990167340dadd702aa9bcc8a1cba02af76a2eacf681fb08bae91fd9b3"
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
