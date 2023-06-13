SUMMARY = "Django data importing and exporting"
DESCRIPTION = "Django application and library for importing and exporting data with included admin integration."
LICENSE = "BSD-2-Clause"

PV = "2.7.1"

RPM_NAME = "python39-django-import-export-2.7.1-1.8.noarch.rpm"
RPM_HASH = "b418095b8a133e2d8be8a58331babc8a9ab9857a099a10b3c7aab968def7b3b4b8c131a1a71716836489af44191aeec2a0c4a41937ee4111a1f0921ab51b8571"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-import-export) \
python39-django-import-export \
python3dist(django-import-export)"

RDEPENDS:${PN} += "python(abi) \
python39-Django \
python39-diff-match-patch \
python39-tablib"

inherit rpm
