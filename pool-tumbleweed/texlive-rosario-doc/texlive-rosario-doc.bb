SUMMARY = "Documentation for texlive-rosario"
DESCRIPTION = "This package includes the documentation for texlive-rosario"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn51688"

RPM_NAME = "texlive-rosario-doc-2023.209.2.1svn51688-54.1.noarch.rpm"
RPM_HASH = "460aa0b8549b68475195479439c5124946ed7f846e9a712017fb7817112951e5e9d4177802a830768f204b7f398e880fc9e02fcf06c18f4d5b9cfe0513dc1834"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rosario-doc"

RDEPENDS:${PN} += ""

inherit rpm
