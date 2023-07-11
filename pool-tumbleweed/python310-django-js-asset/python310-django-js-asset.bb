SUMMARY = "Script tag with additional attributes for django.formsMedia"
DESCRIPTION = "Insert a script tag via forms.Media containing additional \
attributes (such as id and data-* for CSP-compatible data \
injection.)"
LICENSE = "BSD-3-Clause"

PV = "2.0"

RPM_NAME = "python310-django-js-asset-2.0-1.5.noarch.rpm"
RPM_HASH = "415ce7478dfc996335cc60651fa375ab6c183f79a99718610b7c67f6638d03f793d638d033ce94facf32a402c3caefd1375da437de6b637836e621d056ed2cd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-js-asset \
python310-django-js-asset \
python3dist-django-js-asset"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
