SUMMARY = "Pluggable search for Django"
DESCRIPTION = "Pluggable search for Django."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python311-django-haystack-3.2.1-1.4.noarch.rpm"
RPM_HASH = "75ca529dca06a407fa4b8d248651be76632e462270618aeda9692adeb59cdd451ce490733ce053ffc82f19a068f75f97d3b479a30bb66fc89cf53bb980f06180"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-haystack) \
python311-django-haystack \
python3dist(django-haystack)"

RDEPENDS:${PN} += "python(abi) \
python311-Django"

inherit rpm
