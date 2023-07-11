SUMMARY = "Django asset management to compress and merge CSS and Javascript files"
DESCRIPTION = "Asset management for Django, to compress and merge CSS and Javascript files."
LICENSE = "BSD-2-Clause"

PV = "2.0"

RPM_NAME = "python311-django-assets-2.0-5.4.noarch.rpm"
RPM_HASH = "f9b1572e9a9ac3c1d257848f65a0da8acecb51e7f3f6e007b719182af85515c47f2eba0ca35b94ed23e1fab58c4ce3460461865b5c2dbde5135f91e064be263c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-assets \
python3.11dist-django-assets \
python311-django-assets \
python3dist-django-assets"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-webassets"

inherit rpm
