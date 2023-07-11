SUMMARY = "OpenTracing support for Django applications"
DESCRIPTION = "OpenTracing support for Django applications."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python39-django-opentracing-1.1.0-2.6.noarch.rpm"
RPM_HASH = "cd2c7d77d4d4568551f62d064a6dc15b95e0de807e427147459a81d2dd5635c28ba7dc560553cf05ea0a45a60d25829309634dbbd5841b379a73ce1db923d8fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-opentracing \
python39-django-opentracing \
python3dist-django-opentracing"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-opentracing \
python39-six"

inherit rpm
