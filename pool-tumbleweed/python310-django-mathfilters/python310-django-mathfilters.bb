SUMMARY = "Django math filters"
DESCRIPTION = "A set of math filters for Django."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-django-mathfilters-1.0.0-2.6.noarch.rpm"
RPM_HASH = "afb6a4fb2fda431f34fd803442e7ef67008edb2e6586a418a49b0dcd7d43009bd641a5d2c18f744dcaa1edde1a1876f73ec6517d3fb733b21c47526151b69b5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-mathfilters \
python3.10dist-django-mathfilters \
python310-django-mathfilters \
python3dist-django-mathfilters"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
