SUMMARY = "Collections of libCST codemodders to upgrade Django"
DESCRIPTION = "Collections of libCST codemodders to upgrade Django."
LICENSE = "MIT"

PV = "1.11.0"

RPM_NAME = "python310-django-codemod-1.11.0-1.8.noarch.rpm"
RPM_HASH = "c9efbccc1ff164053f08ce4bda78dbffc5bb052c7aa60924ed5e1ec5d42b10cc83e96d305fa330f6d9f6b8202f13a03b0bfeca73e6283b1c73cbe22c0aa5147f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-codemod \
python310-django-codemod \
python3dist-django-codemod"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-click \
python310-libcst \
python310-pathspec \
python310-rich-click \
update-alternatives"

inherit rpm
