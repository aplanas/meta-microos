SUMMARY = "An asset packaging library for Django"
DESCRIPTION = "Pipeline is an asset packaging library for Django, providing both CSS and \
JavaScript concatenation and compression, built-in JavaScript template support, \
and optional data-URI image and font embedding."
LICENSE = "MIT"

PV = "2.0.8"

RPM_NAME = "python39-django-pipeline-2.0.8-2.6.noarch.rpm"
RPM_HASH = "0e2b1fd524401e72212fb71a1cd21d866c4a22e4dbc4cce77dd40a0dc389b423d79d214f19abdd93b9b7b5615e3c0255d3662ec85a1f2dbe886ac327bd8a1ed0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-pipeline \
python39-django-pipeline \
python3dist-django-pipeline"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-Jinja2"

inherit rpm
