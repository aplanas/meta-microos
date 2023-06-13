SUMMARY = "Implementation of per object permissions for Django"
DESCRIPTION = "django-guardian is implementation of per object permissions as \
authorization backend."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "python39-django-guardian-2.4.0-3.5.noarch.rpm"
RPM_HASH = "ae0d4e0801e88cc49a28c4aa5aa42fb0e863b8ddab44dfdcd9b75782882201b54c3576566aa3a4412c4aafc7ac1ef4a18de414a686d42c01d65fe8ab6afce563"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-guardian) \
python39-django-guardian \
python3dist(django-guardian)"

RDEPENDS:${PN} += "python(abi) \
python39-Django"

inherit rpm
