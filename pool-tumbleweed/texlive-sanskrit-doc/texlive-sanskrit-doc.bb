SUMMARY = "Documentation for texlive-sanskrit"
DESCRIPTION = "This package includes the documentation for texlive-sanskrit"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2.4svn64502"

RPM_NAME = "texlive-sanskrit-doc-2023.209.2.2.4svn64502-54.1.noarch.rpm"
RPM_HASH = "c2e6de763cf394fbd8c1bb63d05272ee5fcb722f0a04662d5162ca7868fa2656661c65e80de7a24af8ec46b3224c83c0775a729a1c43e589a80071f8e8d3017d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sanskrit-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
