SUMMARY = "Refresh %INC files when updated on disk"
DESCRIPTION = "This module is a generalization of the functionality provided by \
Apache::StatINC and Apache::Reload. It's designed to make it easy to do \
simple iterative development when working in a persistent environment. \
 \
It does not require mod_perl."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.18"

RPM_NAME = "perl-Module-Refresh-0.18-1.5.noarch.rpm"
RPM_HASH = "30e4f5b70867f35922ff2eee00dcb22f177826bfad2dc3cbb0e1f77ece08242cc4361f1fcef6158d55a2bfc8f908aca11507b26267d17715223a6d60517e318a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Refresh \
perl-Module-Refresh"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
