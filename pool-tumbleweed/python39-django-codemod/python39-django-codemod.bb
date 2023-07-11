SUMMARY = "Collections of libCST codemodders to upgrade Django"
DESCRIPTION = "Collections of libCST codemodders to upgrade Django."
LICENSE = "MIT"

PV = "1.11.0"

RPM_NAME = "python39-django-codemod-1.11.0-1.8.noarch.rpm"
RPM_HASH = "43bb276a24d95b8c6915450eeb9161d4d163131cd772fbe33bc2e3d9639334a92da17ecf26426b26a7dd33c512fdbcd11b738700a47edd9624b1748a9a933562"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-codemod \
python39-django-codemod \
python3dist-django-codemod"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-click \
python39-libcst \
python39-pathspec \
python39-rich-click \
update-alternatives"

inherit rpm
