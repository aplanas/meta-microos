SUMMARY = "Reusable, generic mixins for Django"
DESCRIPTION = "Reusable, generic mixins for Django."
LICENSE = "BSD-3-Clause"

PV = "1.15.0"

RPM_NAME = "python311-django-braces-1.15.0-2.7.noarch.rpm"
RPM_HASH = "697971a69b0e0626e87986057b31bb2c0ba4a500f9bfed51e1d36cabdd6c273c5945f600575327a15f20c5d8ca801b6b455ee95cf0706c55c5ca4263dfc8f731"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-braces \
python3.11dist-django-braces \
python311-django-braces \
python3dist-django-braces"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
