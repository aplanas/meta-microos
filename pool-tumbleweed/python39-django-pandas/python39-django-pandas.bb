SUMMARY = "Tools for working with pandas in Django projects"
DESCRIPTION = "Tools for working with pandas in Django projects."
LICENSE = "BSD-3-Clause"

PV = "0.6.6"

RPM_NAME = "python39-django-pandas-0.6.6-2.6.noarch.rpm"
RPM_HASH = "43ba927831799b887c533b2e058f07becf4cf2a105cf5f19601461ca41e8a11461100dc5ffdaf3a0892ca2314680c2631a301c6387ebc73de420e46e69bf4151"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-pandas \
python39-django-pandas \
python3dist-django-pandas"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-pandas"

inherit rpm
