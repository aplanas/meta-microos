SUMMARY = "Class based template tags for Django"
DESCRIPTION = "This project creates an altnerate way of writing Django template tags \
which is fully compatible with the current Django templating infrastructure."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python310-django-classy-tags-3.0.1-2.1.noarch.rpm"
RPM_HASH = "622e5843396ab069a2832cf5f8775a564f0a567dc4ff4676e062ba0cefea3263fbace47420e6d000b9f7f492a5e70727de0c6e15da4b2cdb89f7a041831106d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-classy-tags \
python310-django-classy-tags \
python3dist-django-classy-tags"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
