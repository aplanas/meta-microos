SUMMARY = "Python implementation of 3-way merge"
DESCRIPTION = "Python implementation of 3-way merge"
LICENSE = "GPL-2.0-or-later"

PV = "0.0.12"

RPM_NAME = "python311-merge3-0.0.12-1.3.noarch.rpm"
RPM_HASH = "7494459f8cc738165ecea1e276034a84c69691a876214e2ca6b71afcdc291f0badb890ca1fdb0431af6fd62e8b2be47d1347104f71844b144c40cba7935e9ace"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(merge3) \
python311-merge3 \
python3dist(merge3)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
