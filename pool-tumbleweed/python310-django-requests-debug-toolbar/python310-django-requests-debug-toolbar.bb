SUMMARY = "A Django Debug Toolbar panel for Requests"
DESCRIPTION = "Django Requests Debug Toolbar tracks all HTTP requests made with the popular \
requests library."
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python310-django-requests-debug-toolbar-0.0.3-1.3.noarch.rpm"
RPM_HASH = "7217883491d49956d2234ea8ecc816410b6da9adbfa631c431236e94d53cc8266df9596f3dbda46a3345205c512234ad0ee50a261539954df65c6475de74afbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-requests-debug-toolbar \
python3.10dist(django-requests-debug-toolbar) \
python310-django-requests-debug-toolbar \
python3dist(django-requests-debug-toolbar)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
