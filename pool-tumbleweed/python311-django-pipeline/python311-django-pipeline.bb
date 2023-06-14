SUMMARY = "An asset packaging library for Django"
DESCRIPTION = "Pipeline is an asset packaging library for Django, providing both CSS and \
JavaScript concatenation and compression, built-in JavaScript template support, \
and optional data-URI image and font embedding."
LICENSE = "MIT"

PV = "2.0.8"

RPM_NAME = "python311-django-pipeline-2.0.8-2.4.noarch.rpm"
RPM_HASH = "5382b505c04f724409db2956b6eddccfc447af58af09c5d42dc8a0e9d1bd7cd67012e810a781cd9672eeb6a4f81f3307178e937586028ceabbadbe5c9f3f077b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-django-pipeline \
python311-django-pipeline \
python3dist-django-pipeline"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-Jinja2"

inherit rpm
