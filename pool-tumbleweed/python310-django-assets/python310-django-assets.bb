SUMMARY = "Django asset management to compress and merge CSS and Javascript files"
DESCRIPTION = "Asset management for Django, to compress and merge CSS and Javascript files."
LICENSE = "BSD-2-Clause"

PV = "2.0"

RPM_NAME = "python310-django-assets-2.0-5.4.noarch.rpm"
RPM_HASH = "7d0979f1427dbbd395e4ec2aecc869a38789bc4f56f39e1e941387fcf1cd0945a04b33bf9052b0df2dacc5ae433c90fe1f1dbdbffc2b849bed274c62f78dbcd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-assets \
python310-django-assets \
python3dist-django-assets"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-webassets"

inherit rpm
