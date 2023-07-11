SUMMARY = "Django math filters"
DESCRIPTION = "A set of math filters for Django."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-django-mathfilters-1.0.0-2.8.noarch.rpm"
RPM_HASH = "e487d300f16af3747d10809876fd73224ce169deb0e83ffab5c89142fa34822af3bfc05335d33765980d26fe873d3e820bbd5f08f6bfea6100b3ac8b0616fd3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-mathfilters \
python3.11dist-django-mathfilters \
python311-django-mathfilters \
python3dist-django-mathfilters"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
