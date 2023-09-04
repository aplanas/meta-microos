SUMMARY = "Refresh %INC files when updated on disk"
DESCRIPTION = "This module is a generalization of the functionality provided by \
Apache::StatINC and Apache::Reload. It's designed to make it easy to do \
simple iterative development when working in a persistent environment. \
 \
It does not require mod_perl."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.18"

RPM_NAME = "perl-Module-Refresh-0.18-1.6.noarch.rpm"
RPM_HASH = "fc264f9846a13e66c55ce521de2e4e6c324a2e6ed2c1fee7a28749f2ea17dd71d7b44bbb33a070a5571c4df79860e538518fa73bbdc04504f1e90aa4bd329551"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Refresh \
perl-Module-Refresh"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
