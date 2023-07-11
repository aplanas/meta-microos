SUMMARY = "Script tag with additional attributes for django.formsMedia"
DESCRIPTION = "Insert a script tag via forms.Media containing additional \
attributes (such as id and data-* for CSP-compatible data \
injection.)"
LICENSE = "BSD-3-Clause"

PV = "2.0"

RPM_NAME = "python311-django-js-asset-2.0-1.5.noarch.rpm"
RPM_HASH = "4fb826c6bf99e73f00eb0fce92f4e990844e3a7eb205edb2d530c2db1d5e1231d9301e8b32cfb02b693035f28d59eaa79f24a8f7643f2039a91a18984fec9c6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-js-asset \
python3.11dist-django-js-asset \
python311-django-js-asset \
python3dist-django-js-asset"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
