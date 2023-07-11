SUMMARY = "A Django Debug Toolbar panel for Requests"
DESCRIPTION = "Django Requests Debug Toolbar tracks all HTTP requests made with the popular \
requests library."
LICENSE = "MIT"

PV = "0.0.5"

RPM_NAME = "python310-django-requests-debug-toolbar-0.0.5-1.1.noarch.rpm"
RPM_HASH = "d5083426ebda87bd66701eb2721f03601860bf32f9c504635c8e99a24a9686f4695dd548db1845f9550a033917ca02df90f14e4ca403e8d86279691a80fcf0f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-requests-debug-toolbar \
python310-django-requests-debug-toolbar \
python3dist-django-requests-debug-toolbar"

RDEPENDS:${PN} += "python-abi"

inherit rpm
