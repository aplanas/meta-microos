SUMMARY = "An asset packaging library for Django"
DESCRIPTION = "Pipeline is an asset packaging library for Django, providing both CSS and \
JavaScript concatenation and compression, built-in JavaScript template support, \
and optional data-URI image and font embedding."
LICENSE = "MIT"

PV = "2.0.8"

RPM_NAME = "python39-django-pipeline-2.0.8-2.4.noarch.rpm"
RPM_HASH = "a08e87ad7930df43fc97787d41fbaa46333a197f2a6fbe5f60243adab4d958d358b1075c561aac6f48322858f55dff2c54a26e913e277c2dc13a0ca8c61882de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-pipeline) \
python39-django-pipeline \
python3dist(django-pipeline)"
RDEPENDS:${PN} += "python(abi) \
python39-Django \
python39-Jinja2"

inherit rpm
