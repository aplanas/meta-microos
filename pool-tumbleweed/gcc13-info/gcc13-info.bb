SUMMARY = "Documentation for the GNU compiler collection"
DESCRIPTION = "GNU info-pages for the GNU compiler collection covering both user-level \
and internals documentation."
LICENSE = "GFDL-1.2-only"

PV = "13.2.1+git7683"

RPM_NAME = "gcc13-info-13.2.1+git7683-1.1.noarch.rpm"
RPM_HASH = "79cf59d5c890272feb6cc62f93c9a423ed4914bb4860d015e6db87cb2a70f9bd248add7c326c9df23360b0f410cf79196e60b4b9c8429d7f2d5af56ee84607a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcc13-info"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
