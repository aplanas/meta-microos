SUMMARY = "Script tag with additional attributes for django.formsMedia"
DESCRIPTION = "Insert a script tag via forms.Media containing additional \
attributes (such as id and data-* for CSP-compatible data \
injection.)"
LICENSE = "BSD-3-Clause"

PV = "2.0"

RPM_NAME = "python310-django-js-asset-2.0-1.3.noarch.rpm"
RPM_HASH = "a023bcb14540212cb37e71a31a6eb4b412717d651401095c2693324478ae9440a42f4cebf7e94df4c9e5e4dd785ed2257cae941317207a5d90439d94419e38ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-js-asset \
python3.10dist(django-js-asset) \
python310-django-js-asset \
python3dist(django-js-asset)"
RDEPENDS:${PN} += "python(abi) \
python310-Django"

inherit rpm
