SUMMARY = "Tools for working with pandas in Django projects"
DESCRIPTION = "Tools for working with pandas in Django projects."
LICENSE = "BSD-3-Clause"

PV = "0.6.6"

RPM_NAME = "python39-django-pandas-0.6.6-2.4.noarch.rpm"
RPM_HASH = "8e0f666ce88a6cd7b36aae1681eb9abcbcd88d9b8a0e01e0bf8bc20324409a9ebddb1ff2513d4efe6c5ab468ef1b29c32454fef1a3ba1d481ade622fd946dd66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-pandas) \
python39-django-pandas \
python3dist(django-pandas)"

RDEPENDS:${PN} += "python(abi) \
python39-Django \
python39-pandas"

inherit rpm
