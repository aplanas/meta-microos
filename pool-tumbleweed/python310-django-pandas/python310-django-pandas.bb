SUMMARY = "Tools for working with pandas in Django projects"
DESCRIPTION = "Tools for working with pandas in Django projects."
LICENSE = "BSD-3-Clause"

PV = "0.6.6"

RPM_NAME = "python310-django-pandas-0.6.6-2.6.noarch.rpm"
RPM_HASH = "c2de644a3d8be7b854a8545cb4b2e10eeb72b2b495ceb4acd28eeb5dec551ecb03a56f16d36773096d6e0db21706ccab967511f7191457bb979a12bf1021e21c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-pandas \
python310-django-pandas \
python3dist-django-pandas"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-pandas"

inherit rpm
