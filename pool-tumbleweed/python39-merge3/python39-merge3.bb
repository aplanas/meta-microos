SUMMARY = "Python implementation of 3-way merge"
DESCRIPTION = "Python implementation of 3-way merge"
LICENSE = "GPL-2.0-or-later"

PV = "0.0.12"

RPM_NAME = "python39-merge3-0.0.12-1.3.noarch.rpm"
RPM_HASH = "44eae1cba6ca6bc8d4dacef04dfb055c6483664d765861c1266ba5ec61387ca416352d9fecbfe0b9b3c63bd3bb14724273c3132947782e99e60d213bb09ad713"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(merge3) \
python39-merge3 \
python3dist(merge3)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
