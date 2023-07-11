SUMMARY = "Documentation for texlive-dviincl"
DESCRIPTION = "This package includes the documentation for texlive-dviincl"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.00svn29349"

RPM_NAME = "texlive-dviincl-doc-2023.201.1.00svn29349-53.2.noarch.rpm"
RPM_HASH = "2a26cbbbe6efaeb1b7ba68551cd253a077e997471f717de43a63622c86f02d146ad31cbe563118d1f0ce5af366ac0bd462a8624a0992b25f7a7a594a5e5ff554"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-dviincl-doc-en;pl \
texlive-dviincl-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
