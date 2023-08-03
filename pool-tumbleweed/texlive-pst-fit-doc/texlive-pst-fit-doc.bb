SUMMARY = "Documentation for texlive-pst-fit"
DESCRIPTION = "This package includes the documentation for texlive-pst-fit"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn45109"

RPM_NAME = "texlive-pst-fit-doc-2023.209.0.0.02svn45109-53.1.noarch.rpm"
RPM_HASH = "784b352b956fadf80f73fae730000183559b28ed27cf748d6c4d45666b82543040143cd099fa12ae148e54a914b8219ce71bd83f959264c803ebf8b27c7d9c29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-fit-doc"

RDEPENDS:${PN} += ""

inherit rpm
