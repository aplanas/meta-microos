SUMMARY = "Documentation for texlive-glosmathtools"
DESCRIPTION = "This package includes the documentation for texlive-glosmathtools"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn55920"

RPM_NAME = "texlive-glosmathtools-doc-2023.209.1.0.0svn55920-54.1.noarch.rpm"
RPM_HASH = "360df51013cd8d7d6a57632d5d8baede8af03f522578f961c429d43a3820150d3d917fb3b2869788fb9a5a4e70940251c9d17cb9a66e5b0aff03fe6de53aca3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-glosmathtools-doc-fr \
texlive-glosmathtools-doc"

RDEPENDS:${PN} += ""

inherit rpm
