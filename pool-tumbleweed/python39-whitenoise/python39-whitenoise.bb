SUMMARY = "Static file serving for WSGI applications"
DESCRIPTION = "Static file serving for WSGI applications."
LICENSE = "MIT"

PV = "6.2.0"

RPM_NAME = "python39-whitenoise-6.2.0-1.5.noarch.rpm"
RPM_HASH = "f99d0a53c5b739eec22c65120ee12cd4e65808954f5dd44a917ff45003ae1c7511e1ee77d237c0a2d520904eaf1df98a0d164860fbf8fc4827ddc1cec520269d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-whitenoise \
python39-whitenoise \
python3dist-whitenoise"

RDEPENDS:${PN} += "python-abi"

inherit rpm
