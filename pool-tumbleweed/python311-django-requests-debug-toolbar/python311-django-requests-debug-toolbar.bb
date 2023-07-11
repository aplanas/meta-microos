SUMMARY = "A Django Debug Toolbar panel for Requests"
DESCRIPTION = "Django Requests Debug Toolbar tracks all HTTP requests made with the popular \
requests library."
LICENSE = "MIT"

PV = "0.0.5"

RPM_NAME = "python311-django-requests-debug-toolbar-0.0.5-1.1.noarch.rpm"
RPM_HASH = "caec1a73c761e05ffb22e371d63ea684977bcac63d806a2d3f6877ca746dd629169b91be5d73f533fcb542ed9a810a517d98d4f5db4650d30f3f83f5f466af46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-requests-debug-toolbar \
python3.11dist-django-requests-debug-toolbar \
python311-django-requests-debug-toolbar \
python3dist-django-requests-debug-toolbar"

RDEPENDS:${PN} += "python-abi"

inherit rpm
