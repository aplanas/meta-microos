SUMMARY = "Documentation for the GNU compiler collection"
DESCRIPTION = "GNU info-pages for the GNU compiler collection covering both user-level \
and internals documentation."
LICENSE = "GFDL-1.2-only"

PV = "13.1.1+git7364"

RPM_NAME = "gcc13-info-13.1.1+git7364-1.1.noarch.rpm"
RPM_HASH = "876b4d930c1a7f9298002aa2579884f33eff9c1f257834c844f6f8f87d70437e3073feb9be386191823afc7a3aaff225c578f4f5bb7b0c2b0214b08be1921502"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcc13-info"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
