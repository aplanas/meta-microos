SUMMARY = "Documentation for the GNU compiler collection"
DESCRIPTION = "GNU info-pages for the GNU compiler collection covering both user-level \
and internals documentation."
LICENSE = "GFDL-1.2-only"

PV = "13.2.1+git7683"

RPM_NAME = "gcc13-info-13.2.1+git7683-2.1.noarch.rpm"
RPM_HASH = "a26c60f9b47f17fac946e5ae092e72183db8b023522303d80ec57c50b1313492f3faa21ce0f138fe59663a6ea53f027853efb28d2b499b27ac1894cf2bc9b217"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcc13-info"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
