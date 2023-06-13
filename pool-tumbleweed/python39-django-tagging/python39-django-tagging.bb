SUMMARY = "A generic tagging application for Django projects"
DESCRIPTION = "A generic tagging application for Django projects, \
which allows association of a number of tags \
with any Model instance and makes retrieval of tags simple."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python39-django-tagging-0.5.0-3.2.noarch.rpm"
RPM_HASH = "858c0660278543d2c766d5ee912e7c44b61155e21b38857b5f5db4c0967156e6c7fcbc45779ec5b0150989c80b92d107b5c6cbc1f22ebdbaf9939f1f3a73cc71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-tagging) \
python39-django-tagging \
python3dist(django-tagging)"

RDEPENDS:${PN} += "python(abi) \
python39-Django"

inherit rpm
