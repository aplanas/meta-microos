SUMMARY = "Jinja2 templating language integrated in Django"
DESCRIPTION = "Simple and nonobstructive jinja2 integration with Django."
LICENSE = "BSD-3-Clause"

PV = "2.10.2"

RPM_NAME = "python39-django-jinja-2.10.2-2.1.noarch.rpm"
RPM_HASH = "a3dd17fe3b1478173e349ee3e0b7f3b7357f0c02c7423af82c1058310c84f7c106aa6617d94e2f29fdef885a4a7c7b3c29d51e5891e62bf64bf1bdf86a27082d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-jinja \
python39-django-jinja \
python3dist-django-jinja"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-Jinja2"

inherit rpm
