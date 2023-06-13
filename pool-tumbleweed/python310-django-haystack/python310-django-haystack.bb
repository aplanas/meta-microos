SUMMARY = "Pluggable search for Django"
DESCRIPTION = "Pluggable search for Django."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python310-django-haystack-3.2.1-1.4.noarch.rpm"
RPM_HASH = "9c924e51869c2c6c65c3e9017707e9bbcb04b90ee5f4a059a6abe7ead6483d2ba69ca0cb5f746b68320768f0d1ff3ed50ee8f91ef4166505b34b4b881b771420"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-haystack \
python3.10dist(django-haystack) \
python310-django-haystack \
python3dist(django-haystack)"

RDEPENDS:${PN} += "python(abi) \
python310-Django"

inherit rpm
