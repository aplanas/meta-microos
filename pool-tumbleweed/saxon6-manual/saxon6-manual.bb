SUMMARY = "Manual for saxon6"
DESCRIPTION = "Manual for saxon6."
LICENSE = "MPL-1.0"

PV = "6.5.5"

RPM_NAME = "saxon6-manual-6.5.5-16.7.noarch.rpm"
RPM_HASH = "f2a55ef242bfdfecf36d2a37966dae7e8e6a9d8fda62ccb6077dfc4188427119e331b862fd03634640266529ee0d6425662fa8468e2955cbe818db1409826e6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon6-manual"

RDEPENDS:${PN} += ""

inherit rpm
