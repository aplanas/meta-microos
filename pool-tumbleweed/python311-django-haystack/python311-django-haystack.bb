SUMMARY = "Pluggable search for Django"
DESCRIPTION = "Pluggable search for Django."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python311-django-haystack-3.2.1-2.1.noarch.rpm"
RPM_HASH = "6bcc4bfbde2c80daf38be9eb0f17fb8beeecea1e120c8141af830365d299c328b25c09fff667496d1cc02129f7b9a4d76ce52ea280cde3d19f37dda981411db5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-haystack \
python3.11dist-django-haystack \
python311-django-haystack \
python3dist-django-haystack"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
