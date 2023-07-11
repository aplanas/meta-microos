SUMMARY = "Class based template tags for Django"
DESCRIPTION = "This project creates an altnerate way of writing Django template tags \
which is fully compatible with the current Django templating infrastructure."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python311-django-classy-tags-3.0.1-2.1.noarch.rpm"
RPM_HASH = "6c637a6ad034e5d2c6c3f3c69882b0f9b6cf012d51b73d58b1a276af119692e37e899b0b466336b4bb87f40db8ae13791dffa2ffabd24c659e6b9d6bd30e8f21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-classy-tags \
python3.11dist-django-classy-tags \
python311-django-classy-tags \
python3dist-django-classy-tags"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
