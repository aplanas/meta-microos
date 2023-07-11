SUMMARY = "Collections of libCST codemodders to upgrade Django"
DESCRIPTION = "Collections of libCST codemodders to upgrade Django."
LICENSE = "MIT"

PV = "1.11.0"

RPM_NAME = "python311-django-codemod-1.11.0-1.8.noarch.rpm"
RPM_HASH = "d9c09de496f7c3d89a167f84517a7ce4720b623ca81ac1868b72ea4977b2ee8da491d83e3571e1b290e24ac86a802101ddf583fee0ff030b8e3c5cb158fcded1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-codemod \
python3.11dist-django-codemod \
python311-django-codemod \
python3dist-django-codemod"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-click \
python311-libcst \
python311-pathspec \
python311-rich-click \
update-alternatives"

inherit rpm
