SUMMARY = "A Django App that adds CORS headers to responses"
DESCRIPTION = "A Django App that adds CORS (Cross-Origin Resource Sharing) headers to \
responses."
LICENSE = "MIT"

PV = "3.13.0"

RPM_NAME = "python311-django-cors-headers-3.13.0-1.3.noarch.rpm"
RPM_HASH = "2ef2c628299071857eea18fd3bb8de2bc428350f18b9efc94e5d76df1d83161e42ecc77227a182e17161b3563743b7d8eea3d39f4fe4683b623129a9d9cd29a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-cors-headers) \
python311-django-cors-headers \
python3dist(django-cors-headers)"
RDEPENDS:${PN} += "python(abi) \
python311-Django"

inherit rpm
