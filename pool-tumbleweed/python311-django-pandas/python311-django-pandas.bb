SUMMARY = "Tools for working with pandas in Django projects"
DESCRIPTION = "Tools for working with pandas in Django projects."
LICENSE = "BSD-3-Clause"

PV = "0.6.6"

RPM_NAME = "python311-django-pandas-0.6.6-2.4.noarch.rpm"
RPM_HASH = "bc78effc7184c75aad5ffd67d0884ab30c28be4ffcd5891fa06115d5a5bc6af7d2400318f78b475ad870d9c69e2bb51063d759917ba463635f671e61fb2311e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-pandas) \
python311-django-pandas \
python3dist(django-pandas)"

RDEPENDS:${PN} += "python(abi) \
python311-Django \
python311-pandas"

inherit rpm
