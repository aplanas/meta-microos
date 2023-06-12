SUMMARY = "Documentation for texlive-armtex"
DESCRIPTION = "This package includes the documentation for texlive-armtex"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0_beta4svn64182"

RPM_NAME = "texlive-armtex-doc-2023.201.3.0_beta4svn64182-54.1.noarch.rpm"
RPM_HASH = "f22bb41c7d962cdd31e8eea469609561f061a6bfeff3c09cd098ad4247d6e8cf5a36753ecc52da9f71296f3864acdbc8f30ed05bdfa72d6657f27d001d9316b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-armtex-doc:en;hy) \
texlive-armtex-doc"
RDEPENDS:${PN} += ""

inherit rpm
