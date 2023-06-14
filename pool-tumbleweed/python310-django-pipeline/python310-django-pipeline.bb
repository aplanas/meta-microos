SUMMARY = "An asset packaging library for Django"
DESCRIPTION = "Pipeline is an asset packaging library for Django, providing both CSS and \
JavaScript concatenation and compression, built-in JavaScript template support, \
and optional data-URI image and font embedding."
LICENSE = "MIT"

PV = "2.0.8"

RPM_NAME = "python310-django-pipeline-2.0.8-2.4.noarch.rpm"
RPM_HASH = "86e8b9e79bb3206a05a9716cfc3991514909044888f85ee397a42c4056e73eb4f9daf19ed1c21e3acc31a573e92371ee610ba538d05276ff30288222f7f91574"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-pipeline \
python3.10dist-django-pipeline \
python310-django-pipeline \
python3dist-django-pipeline"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-Jinja2"

inherit rpm
