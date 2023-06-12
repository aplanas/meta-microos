SUMMARY = "Django asset management to compress and merge CSS and Javascript files"
DESCRIPTION = "Asset management for Django, to compress and merge CSS and Javascript files."
LICENSE = "BSD-2-Clause"

PV = "2.0"

RPM_NAME = "python311-django-assets-2.0-5.2.noarch.rpm"
RPM_HASH = "d5820654dde49a1e4717aca795058202acd2ebe57c24bdf3012bbbeece22ad8a2604bb607a944fa283d6fd565c4c7c16e11896868a009152a7069d36a1b52593"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-assets) \
python311-django-assets \
python3dist(django-assets)"
RDEPENDS:${PN} += "python(abi) \
python311-Django \
python311-webassets"

inherit rpm
