SUMMARY = "Django data importing and exporting"
DESCRIPTION = "Django application and library for importing and exporting data with included admin integration."
LICENSE = "BSD-2-Clause"

PV = "2.7.1"

RPM_NAME = "python310-django-import-export-2.7.1-1.10.noarch.rpm"
RPM_HASH = "699414d8df2847f8bfc62f8985e79592b641ef40c0bd519714ce34cd7287ef68dafcbd6e35bf14aa758e76e705b20c166583654ae82f2728bf237f27d7d6262a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-import-export \
python310-django-import-export \
python3dist-django-import-export"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-diff-match-patch \
python310-tablib"

inherit rpm
