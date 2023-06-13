SUMMARY = "Refresh %INC files when updated on disk"
DESCRIPTION = "This module is a generalization of the functionality provided by \
Apache::StatINC and Apache::Reload. It's designed to make it easy to do \
simple iterative development when working in a persistent environment. \
 \
It does not require mod_perl."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.18"

RPM_NAME = "perl-Module-Refresh-0.18-1.4.noarch.rpm"
RPM_HASH = "2e1ea5a938ae592fd082b5b27762120e52b492186c3690ad21d75115b08a798fc83fb6a63347580420789c0c18e8961032eafd728daf020d11806141f1c45539"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Module::Refresh) \
perl-Module-Refresh"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
