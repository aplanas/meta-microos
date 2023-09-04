SUMMARY = "Documentation for texlive-register"
DESCRIPTION = "This package includes the documentation for texlive-register"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn54485"

RPM_NAME = "texlive-register-doc-2023.209.2.0svn54485-54.2.noarch.rpm"
RPM_HASH = "a8fff2b6cb94172e1e193725519820519d658b88e19844b11281c868fb6c7b68f0a6aae96642e8bbc4020fcdb06a1635b428d0003a746ae6056dfc2e8e5c35f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Reg-macro \
texlive-register-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
