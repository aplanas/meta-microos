SUMMARY = "An asset packaging library for Django"
DESCRIPTION = "Pipeline is an asset packaging library for Django, providing both CSS and \
JavaScript concatenation and compression, built-in JavaScript template support, \
and optional data-URI image and font embedding."
LICENSE = "MIT"

PV = "2.0.8"

RPM_NAME = "python311-django-pipeline-2.0.8-2.6.noarch.rpm"
RPM_HASH = "858a59d0bb4fcd5c7c62aca015da37707c6d2658899a7bae2f6e68a068c3163e39163e1b070673d959f86ad51478366aaec7492e951ee796d836503461d75e30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-pipeline \
python3.11dist-django-pipeline \
python311-django-pipeline \
python3dist-django-pipeline"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-Jinja2"

inherit rpm
