SUMMARY = "Django math filters"
DESCRIPTION = "A set of math filters for Django."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-django-mathfilters-1.0.0-2.8.noarch.rpm"
RPM_HASH = "1f9ccc209d55f8d050b462d69f79ff59ad85862715d8769dfc3db39a7eb5abfda263bedcbc2946d58aa0fd7f919756bced197b4ff9dd0187c5edaf344a56c397"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-mathfilters \
python310-django-mathfilters \
python3dist-django-mathfilters"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
