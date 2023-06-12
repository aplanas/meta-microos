SUMMARY = "Documentation for texlive-jura"
DESCRIPTION = "This package includes the documentation for texlive-jura"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.4.3svn15878"

RPM_NAME = "texlive-jura-doc-2023.201.4.3svn15878-55.1.noarch.rpm"
RPM_HASH = "27f18180b0f2ce9ad3e6118564a711dfb58dcb12e04bed30474ebc00f70de4627e977f8546e34d06cbc434caf414f7c1cc4c135899c71be0c7b5e5d8322cdd31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-jura-doc:en;de) \
texlive-jura-doc"
RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
