SUMMARY = "Gravatar Support for Django"
DESCRIPTION = "Essential Gravatar support for Django. Features helper methods, templatetags and a full test suite!"
LICENSE = "MIT"

PV = "1.4.4"

RPM_NAME = "python311-django-gravatar2-1.4.4-3.1.noarch.rpm"
RPM_HASH = "2fc5bfb1f5073cc3b2721e92934d4f4403e7daefcb3dddcba9f7b82c929fe0e2f0181c98f3d5e915d4e26ee7daf5f3a13e983aaff2aeb4e643eb3c2205340e0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-gravatar2 \
python3.11dist-django-gravatar2 \
python311-django-gravatar2 \
python3dist-django-gravatar2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
