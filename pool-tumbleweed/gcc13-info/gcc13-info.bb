SUMMARY = "Documentation for the GNU compiler collection"
DESCRIPTION = "GNU info-pages for the GNU compiler collection covering both user-level \
and internals documentation."
LICENSE = "GFDL-1.2-only"

PV = "13.1.1+git7552"

RPM_NAME = "gcc13-info-13.1.1+git7552-1.1.noarch.rpm"
RPM_HASH = "1b18448d39cb977a851d4e578d3328f293f36cdd54c0480434efbe70587d54a1eb8f2ded4bcac066f5fbf3511be96f6cf1929036c073507225a57c53f119e3dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcc13-info"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
