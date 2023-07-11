SUMMARY = "A Django Debug Toolbar panel for Requests"
DESCRIPTION = "Django Requests Debug Toolbar tracks all HTTP requests made with the popular \
requests library."
LICENSE = "MIT"

PV = "0.0.5"

RPM_NAME = "python39-django-requests-debug-toolbar-0.0.5-1.1.noarch.rpm"
RPM_HASH = "bdb8d52bcde01c946012d33ff33ae815e57112d2f8933690260a1284a75ba24ea7954d13b9ea037d4472d8c1e1002d15a54f5d1c0678d28a9a376bb65393760f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-requests-debug-toolbar \
python39-django-requests-debug-toolbar \
python3dist-django-requests-debug-toolbar"

RDEPENDS:${PN} += "python-abi"

inherit rpm
