SUMMARY = "Django domain-driven e-commerce framework"
DESCRIPTION = "A domain-driven e-commerce framework for Django."
LICENSE = "BSD-3-Clause"

PV = "3.1"

RPM_NAME = "python311-django-oscar-3.1-2.3.noarch.rpm"
RPM_HASH = "e363a1df54b2c8f8b6335843eb40fcc651b17849e6aa313bc048f0a97053174c85ae2d77f38501e099fb7b160f0817b1a6ba88dcfd3f4f7161d50d58e27d19aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-oscar) \
python311-django-oscar \
python3dist(django-oscar)"

RDEPENDS:${PN} += "python(abi) \
python311-Babel \
python311-Django \
python311-Pillow \
python311-django-extra-views \
python311-django-haystack \
python311-django-phonenumber-field \
python311-django-tables2 \
python311-django-treebeard \
python311-django-widget-tweaks \
python311-phonenumbers \
python311-purl"

inherit rpm
