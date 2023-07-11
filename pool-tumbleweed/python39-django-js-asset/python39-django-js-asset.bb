SUMMARY = "Script tag with additional attributes for django.formsMedia"
DESCRIPTION = "Insert a script tag via forms.Media containing additional \
attributes (such as id and data-* for CSP-compatible data \
injection.)"
LICENSE = "BSD-3-Clause"

PV = "2.0"

RPM_NAME = "python39-django-js-asset-2.0-1.5.noarch.rpm"
RPM_HASH = "45995042282f65d700c4707a3f64d562743ce33f743277106a4592c2c284ae85bd45b3d129470015a7c2a0c3f83a536292193d6b6596e272de050f99cf105a16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-js-asset \
python39-django-js-asset \
python3dist-django-js-asset"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
