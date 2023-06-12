SUMMARY = "An extensible user-registration application for Django"
DESCRIPTION = "This is a user registration application for Django. It requires a \
functional installation of Django, but has no other \
dependencies."
LICENSE = "BSD-3-Clause"

PV = "3.3"

RPM_NAME = "python311-django-registration-3.3-1.3.noarch.rpm"
RPM_HASH = "d6c7cf001cf73afb0735e6635b0346bafde2f74420e7de9cad7270df27e63eef12ec15aa8219587bd6e28cdaa4871748ac65717d5a75d0591b21889b5349d1c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-registration) \
python311-django-registration \
python3dist(django-registration)"
RDEPENDS:${PN} += "python(abi) \
python311-Django \
python311-confusable-homoglyphs"

inherit rpm
