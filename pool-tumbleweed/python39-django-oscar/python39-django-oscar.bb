SUMMARY = "Django domain-driven e-commerce framework"
DESCRIPTION = "A domain-driven e-commerce framework for Django."
LICENSE = "BSD-3-Clause"

PV = "3.1"

RPM_NAME = "python39-django-oscar-3.1-2.3.noarch.rpm"
RPM_HASH = "897741eab5d9274c73c8b7462ed42c8edda5e42402fa56b59771463af2941a247be19d70a7ca8008eee5b5cddc185efecd8d0fc0ca4e1105402369d2057a7ef4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-oscar) \
python39-django-oscar \
python3dist(django-oscar)"

RDEPENDS:${PN} += "python(abi) \
python39-Babel \
python39-Django \
python39-Pillow \
python39-django-extra-views \
python39-django-haystack \
python39-django-phonenumber-field \
python39-django-tables2 \
python39-django-treebeard \
python39-django-widget-tweaks \
python39-phonenumbers \
python39-purl"

inherit rpm
