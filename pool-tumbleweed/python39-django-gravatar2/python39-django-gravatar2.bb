SUMMARY = "Gravatar Support for Django"
DESCRIPTION = "Essential Gravatar support for Django. Features helper methods, templatetags and a full test suite!"
LICENSE = "MIT"

PV = "1.4.4"

RPM_NAME = "python39-django-gravatar2-1.4.4-2.6.noarch.rpm"
RPM_HASH = "0bf9c719d3ab490794efb482e06db3c0d568bfee0122cc42fb93ee42013713d119999753ad578073760fb1d5d279b3e1bef753de644e82357f381983830e3978"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-gravatar2 \
python39-django-gravatar2 \
python3dist-django-gravatar2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
