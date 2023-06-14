SUMMARY = "Jinja2 templating language integrated in Django"
DESCRIPTION = "Simple and nonobstructive jinja2 integration with Django."
LICENSE = "BSD-3-Clause"

PV = "2.10.2"

RPM_NAME = "python311-django-jinja-2.10.2-1.3.noarch.rpm"
RPM_HASH = "de2a9f20a55e72932639ab88b5fc636f0671eed839dfc43ad09f95be76da7cc86941f2c330833258825b1f1bf9e91a074bfb125cb84f93bef5b88d9047260b7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-django-jinja \
python311-django-jinja \
python3dist-django-jinja"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-Jinja2"

inherit rpm
