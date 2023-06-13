SUMMARY = "A webservice API framework layer for Django"
DESCRIPTION = "Tastypie is a webservice API framework for Django. It provides a \
customizable abstraction for creating REST-style interfaces."
LICENSE = "BSD-3-Clause"

PV = "0.14.5"

RPM_NAME = "python39-django-tastypie-0.14.5-1.4.noarch.rpm"
RPM_HASH = "fa468c46cad6144681570192130cd80f992979f37e8f35a44dc51a8c5db7f4511c43ab685ccaaf5755ef3f8ab200d81a6a22d1bae69eb392867133d1aab2ae9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-tastypie) \
python39-django-tastypie \
python3dist(django-tastypie)"

RDEPENDS:${PN} += "python(abi) \
python39-Django \
python39-python-dateutil \
python39-python-mimeparse"

inherit rpm
