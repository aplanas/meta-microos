SUMMARY = "An asset packaging library for Django"
DESCRIPTION = "Pipeline is an asset packaging library for Django, providing both CSS and \
JavaScript concatenation and compression, built-in JavaScript template support, \
and optional data-URI image and font embedding."
LICENSE = "MIT"

PV = "2.0.8"

RPM_NAME = "python310-django-pipeline-2.0.8-2.6.noarch.rpm"
RPM_HASH = "63683bef3bc84b8c04bf520c8658c5428784676bf74b16785904d5bd2042ff133c8bcb53d0270858fe1bb9e2139ce7d133098674f52456aa488566e9cee5972c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-pipeline \
python310-django-pipeline \
python3dist-django-pipeline"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-Jinja2"

inherit rpm
