SUMMARY = "Kombu actor framework"
DESCRIPTION = "Actor framework for Kombu"
LICENSE = "BSD-2-Clause"

PV = "0.0.3"

RPM_NAME = "python39-cl-0.0.3-16.4.noarch.rpm"
RPM_HASH = "db91694bcea51c11aa5617ccea1dc2f59a12e58052254e4a5a982033e286452bbce4d7a9df0c9fdec5a8f24aa2d32468455a27bf696657f6dbe17c953baeffe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cl) \
python39-cl \
python3dist(cl)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-kombu \
update-alternatives"

inherit rpm
