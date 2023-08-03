SUMMARY = "Documentation for texlive-turnstile"
DESCRIPTION = "This package includes the documentation for texlive-turnstile"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn64967"

RPM_NAME = "texlive-turnstile-doc-2023.209.1.0svn64967-53.1.noarch.rpm"
RPM_HASH = "96b874e5732caaef357800a40b43fe1a1a5618db5da72c31e552ea11ec2aab2b0b4e0482d6823a5587f3e0e7434d0b715096218b145db917937ec8780dfc369c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-turnstile-doc-pt \
texlive-turnstile-doc"

RDEPENDS:${PN} += ""

inherit rpm
