SUMMARY = "Documentation for texlive-fontname"
DESCRIPTION = "This package includes the documentation for texlive-fontname"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn64477"

RPM_NAME = "texlive-fontname-doc-2023.209.svn64477-53.1.noarch.rpm"
RPM_HASH = "85f6c5ff6d7619502031d0c729f61f65a2a214df351ac1a40372cdd01b7e1a5796a1a53a0011036bc19ab14e1cb492dbde35e58b2f1b2fbe17a9b7583d570ac1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontname-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
