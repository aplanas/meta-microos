SUMMARY = "Django data importing and exporting"
DESCRIPTION = "Django application and library for importing and exporting data with included admin integration."
LICENSE = "BSD-2-Clause"

PV = "2.7.1"

RPM_NAME = "python311-django-import-export-2.7.1-1.10.noarch.rpm"
RPM_HASH = "3679f72d197dec7a26293249dacca913f393305f63ded707994b2ae5104cab6565bb150c6a1e6ed9e0fa61389c360998416483a3839e4cbad4461fa0e3d49159"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-import-export \
python3.11dist-django-import-export \
python311-django-import-export \
python3dist-django-import-export"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-diff-match-patch \
python311-tablib"

inherit rpm
