SUMMARY = "Documentation for texlive-contracard"
DESCRIPTION = "This package includes the documentation for texlive-contracard"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.0svn50217"

RPM_NAME = "texlive-contracard-doc-2023.209.2.0.0svn50217-55.1.noarch.rpm"
RPM_HASH = "cfef22dc720a20d864c12a7cc0c59aec4d8e3412f7fd53bcf26b2e897a8058af41badbb7a476d52f6dce707730e9120b287139de7321abf054b2b3b616820cbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-contracard-doc"

RDEPENDS:${PN} += ""

inherit rpm
