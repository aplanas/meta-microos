SUMMARY = "Collections of libCST codemodders to upgrade Django"
DESCRIPTION = "Collections of libCST codemodders to upgrade Django."
LICENSE = "MIT"

PV = "1.11.0"

RPM_NAME = "python311-django-codemod-1.11.0-1.6.noarch.rpm"
RPM_HASH = "91deb25fb667dae726c244c26096acff5d1f6ea8028d1a8f3235a1747d3176e8005c28bcef15f0a3ee8fd205b2045add75c710dfe88bfce7333db33ca0851465"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-django-codemod \
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
