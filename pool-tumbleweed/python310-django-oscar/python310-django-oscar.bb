SUMMARY = "Django domain-driven e-commerce framework"
DESCRIPTION = "A domain-driven e-commerce framework for Django."
LICENSE = "BSD-3-Clause"

PV = "3.1"

RPM_NAME = "python310-django-oscar-3.1-2.3.noarch.rpm"
RPM_HASH = "1c0326640e316befedc53739ef24951a3af6356b4e8ed4c559b9ba5b7c2e7840668bec84b231a71873a483290fb5e01a757159705b6feeea4c7ba71eea6f52fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-oscar \
python3.10dist(django-oscar) \
python310-django-oscar \
python3dist(django-oscar)"

RDEPENDS:${PN} += "python(abi) \
python310-Babel \
python310-Django \
python310-Pillow \
python310-django-extra-views \
python310-django-haystack \
python310-django-phonenumber-field \
python310-django-tables2 \
python310-django-treebeard \
python310-django-widget-tweaks \
python310-phonenumbers \
python310-purl"

inherit rpm
