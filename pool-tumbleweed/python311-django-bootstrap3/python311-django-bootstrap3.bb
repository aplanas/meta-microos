SUMMARY = "Bootstrap support for Django projects"
DESCRIPTION = "Bootstrap support for Django projects."
LICENSE = "BSD-3-Clause"

PV = "14.2.0"

RPM_NAME = "python311-django-bootstrap3-14.2.0-2.8.noarch.rpm"
RPM_HASH = "b183cc3d60e2b00d095e3754f2936a09b73eb28b2bb3666f6858f804514e32c5b0fd66f03916d6d72c72bd10ca020f08527c6e09cb849427318fa171b7627225"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-bootstrap3 \
python3.11dist-django-bootstrap3 \
python311-django-bootstrap3 \
python3dist-django-bootstrap3"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
