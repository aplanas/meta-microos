SUMMARY = "Django asset management to compress and merge CSS and Javascript files"
DESCRIPTION = "Asset management for Django, to compress and merge CSS and Javascript files."
LICENSE = "BSD-2-Clause"

PV = "2.0"

RPM_NAME = "python310-django-assets-2.0-5.2.noarch.rpm"
RPM_HASH = "119b087bf8d16470ca1ab4995d5866e8ebc91811ffeaaa87188ef1450369e26c602c9600b487e943621cea64f4924dd3ca00ebd0f8cd879b6cc9fcd12662e936"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-assets \
python3.10dist(django-assets) \
python310-django-assets \
python3dist(django-assets)"
RDEPENDS:${PN} += "python(abi) \
python310-Django \
python310-webassets"

inherit rpm
