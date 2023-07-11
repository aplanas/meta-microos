SUMMARY = "Class based template tags for Django"
DESCRIPTION = "This project creates an altnerate way of writing Django template tags \
which is fully compatible with the current Django templating infrastructure."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python39-django-classy-tags-3.0.1-2.1.noarch.rpm"
RPM_HASH = "eff8d8484e1736d8082a554c65b8616956a807a3f9b528244c714b28eb40037ef4d58b8fcdfc4861706fae652f9709fb900637a03fd4837494aa1c0880907a71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-classy-tags \
python39-django-classy-tags \
python3dist-django-classy-tags"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
