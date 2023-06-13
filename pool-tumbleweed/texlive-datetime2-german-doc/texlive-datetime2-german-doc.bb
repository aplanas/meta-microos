SUMMARY = "Documentation for texlive-datetime2-german"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-german"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0svn53125"

RPM_NAME = "texlive-datetime2-german-doc-2023.201.3.0svn53125-52.1.noarch.rpm"
RPM_HASH = "6571f0c929afdb7bfc3ca7cbfd0c83ed503ce59c260cf9111701a9b5fea262b846279284208567ade0542d1421f320b929325f64b4b5e4f22b9f4158d63fca24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-german-doc"

RDEPENDS:${PN} += ""

inherit rpm
