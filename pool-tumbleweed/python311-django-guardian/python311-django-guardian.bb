SUMMARY = "Implementation of per object permissions for Django"
DESCRIPTION = "django-guardian is implementation of per object permissions as \
authorization backend."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "python311-django-guardian-2.4.0-3.5.noarch.rpm"
RPM_HASH = "c2a7291d60a844d6d3cf55f56bef027f6a24bf9ee4f4526a986083bd11a53ebee2ce0d5f6f849723d2305f32147ae43ef4e069763d585dcfa19dcaad3adb4666"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-guardian) \
python311-django-guardian \
python3dist(django-guardian)"

RDEPENDS:${PN} += "python(abi) \
python311-Django"

inherit rpm
