SUMMARY = "Django domain-driven e-commerce framework"
DESCRIPTION = "A domain-driven e-commerce framework for Django."
LICENSE = "BSD-3-Clause"

PV = "3.1"

RPM_NAME = "python38-django-oscar-3.1-2.3.noarch.rpm"
RPM_HASH = "1cd73434f3ef9c6d6dd2a2491c5457d1dd235c859bb7ed428448f5b1b360dac95b258aa42e34040c879a44498f711d9f6ff9b4bb36b25292795bf40b3cc1b28d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist(django-oscar) \
python38-django-oscar \
python3dist(django-oscar)"

RDEPENDS:${PN} += "python(abi) \
python38-Babel \
python38-Django \
python38-Pillow \
python38-django-extra-views \
python38-django-haystack \
python38-django-phonenumber-field \
python38-django-tables2 \
python38-django-treebeard \
python38-django-widget-tweaks \
python38-phonenumbers \
python38-purl"

inherit rpm
