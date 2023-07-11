SUMMARY = "Django data importing and exporting"
DESCRIPTION = "Django application and library for importing and exporting data with included admin integration."
LICENSE = "BSD-2-Clause"

PV = "2.7.1"

RPM_NAME = "python39-django-import-export-2.7.1-1.10.noarch.rpm"
RPM_HASH = "d8f4f5b99ce80e9dd4f2c3d4fcdd7ef43f10709928409741ce9d8a93468a6d7e0f59aeb03032c0c685c48f82828880ba11b7aa1b03c6463327fdea9206ddab98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-import-export \
python39-django-import-export \
python3dist-django-import-export"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-diff-match-patch \
python39-tablib"

inherit rpm
