SUMMARY = "Django asset management to compress and merge CSS and Javascript files"
DESCRIPTION = "Asset management for Django, to compress and merge CSS and Javascript files."
LICENSE = "BSD-2-Clause"

PV = "2.0"

RPM_NAME = "python39-django-assets-2.0-5.2.noarch.rpm"
RPM_HASH = "11f855685b55c356b714a8bc342271ef8f73d68bf6131a956479e6b57c740bb6d7e739d3d77cd616cc6f3d2c4402b82b2b7eb0a291c1c5aea676bcb6ae98c9bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-assets) \
python39-django-assets \
python3dist(django-assets)"
RDEPENDS:${PN} += "python(abi) \
python39-Django \
python39-webassets"

inherit rpm
