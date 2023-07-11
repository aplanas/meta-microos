SUMMARY = "Django model field that can hold a geoposition"
DESCRIPTION = "Django model field that can hold a geoposition, and corresponding admin widget."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python39-django-geoposition-0.3.0-2.9.noarch.rpm"
RPM_HASH = "5f3b218d51d076ee2a8b7a0d3f242a6646771b388fd462d5f3309042bee28c1b88d19a0c14496a4b0e01aba8f97f3b3660278289b0aa35b45de2f9b473eb2077"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-geoposition \
python39-django-geoposition \
python3dist-django-geoposition"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
