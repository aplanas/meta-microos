SUMMARY = "Django-avatar package"
DESCRIPTION = "Django-avatar is a reusable application for handling user avatars.  It has the \
ability to default to Gravatar_ if no avatar is found for a certain user. \
Django-avatar automatically generates thumbnails and stores them to your default \
file storage backend for retrieval later."
LICENSE = "BSD-3-Clause"

PV = "7.1.1"

RPM_NAME = "python39-django-avatar-7.1.1-1.2.noarch.rpm"
RPM_HASH = "80062a290c7f9770527995ac09616eaa0984a11bbd092c74168606cb9ba0b2addefa25c5731404620923d38759a5b9bf31dddf7313640da5dbd76ba6c84ef3f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-avatar) \
python39-django-avatar \
python3dist(django-avatar)"
RDEPENDS:${PN} += "python(abi) \
python39-Django \
python39-Pillow \
python39-django-appconf \
python39-dnspython"

inherit rpm
