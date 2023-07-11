SUMMARY = "Reusable, generic mixins for Django"
DESCRIPTION = "Reusable, generic mixins for Django."
LICENSE = "BSD-3-Clause"

PV = "1.15.0"

RPM_NAME = "python310-django-braces-1.15.0-2.7.noarch.rpm"
RPM_HASH = "5e71a95bca61916c1b9ea2732019b1d7eb7eeace12159a00512e24a34984b8f7a41dc6a7f46eac1d166e3da1c69845b155b073989a3ed024426f2ec87cb5352f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-braces \
python310-django-braces \
python3dist-django-braces"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
