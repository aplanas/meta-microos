SUMMARY = "Reusable, generic mixins for Django"
DESCRIPTION = "Reusable, generic mixins for Django."
LICENSE = "BSD-3-Clause"

PV = "1.15.0"

RPM_NAME = "python39-django-braces-1.15.0-2.7.noarch.rpm"
RPM_HASH = "9b72c99f888e30f4ba457dfcacbf28afe5982a1683cb65f96d8462afd006aee435b30dd0a3591831eb1e61dfca6499c00c0ac70752bddf1d2f07dbb3133a9560"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-braces \
python39-django-braces \
python3dist-django-braces"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
