SUMMARY = "Django Template Blocks with extra functionality"
DESCRIPTION = "Django Template Blocks with extra functionality"
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-django-sekizai-2.0.0-3.7.noarch.rpm"
RPM_HASH = "73689b36b66ba81b310f6444b163c120f98bd8c25ee4d597e1e94ff8ba750b475bdd88dbae3e208bb1ed714aaec859f75f47da6d7fe0260b484c03a2441533f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-sekizai) \
python39-django-sekizai \
python3dist(django-sekizai)"

RDEPENDS:${PN} += "python(abi) \
python39-Django \
python39-django-classy-tags"

inherit rpm
