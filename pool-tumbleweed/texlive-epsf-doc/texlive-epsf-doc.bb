SUMMARY = "Documentation for texlive-epsf"
DESCRIPTION = "This package includes the documentation for texlive-epsf"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.2.7.4svn21461"

RPM_NAME = "texlive-epsf-doc-2023.209.2.7.4svn21461-54.1.noarch.rpm"
RPM_HASH = "8ae98fda425ebacb8968ca9636da707bde0383cf01f9162152f03052e1a70a581f7ae3069dc3132c6ee4af571500d6e3b5556e07870d5bb0203b6967387e3226"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epsf-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
