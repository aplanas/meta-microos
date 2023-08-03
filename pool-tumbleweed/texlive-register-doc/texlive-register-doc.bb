SUMMARY = "Documentation for texlive-register"
DESCRIPTION = "This package includes the documentation for texlive-register"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn54485"

RPM_NAME = "texlive-register-doc-2023.209.2.0svn54485-54.1.noarch.rpm"
RPM_HASH = "cc282ff9f9cb84b4972149e120f9148674ff31d3724399da98587074e23a44de3aeba0fdc6a7da83bd83c3ae1ed00f0d07153418107c4df7ca77e783c8827cf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Reg-macro \
texlive-register-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
