SUMMARY = "Django asset management to compress and merge CSS and Javascript files"
DESCRIPTION = "Asset management for Django, to compress and merge CSS and Javascript files."
LICENSE = "BSD-2-Clause"

PV = "2.0"

RPM_NAME = "python39-django-assets-2.0-5.4.noarch.rpm"
RPM_HASH = "dc513363dde62cbb698a3bbcd08334dacd99483140ac3cadfd961527c7f0b086f9dcc1c97ceace16e284ad7e34510d223a440901b50674a00cf0b77300d72b58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-assets \
python39-django-assets \
python3dist-django-assets"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-webassets"

inherit rpm
