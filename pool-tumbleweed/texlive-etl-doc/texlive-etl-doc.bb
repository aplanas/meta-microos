SUMMARY = "Documentation for texlive-etl"
DESCRIPTION = "This package includes the documentation for texlive-etl"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn60998"

RPM_NAME = "texlive-etl-doc-2023.209.0.0.3svn60998-53.1.noarch.rpm"
RPM_HASH = "6dc44532aaa9edda9b9b71d26bd21cb08111971a57af1fbc79bf0d6ef493b85f6ac244503aa0872619525de8a092ade24f96f8a5f3e917ef9d5fc90a10d238a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-etl-doc"

RDEPENDS:${PN} += ""

inherit rpm
