SUMMARY = "Documentation for texlive-philosophersimprint"
DESCRIPTION = "This package includes the documentation for texlive-philosophersimprint"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn56954"

RPM_NAME = "texlive-philosophersimprint-doc-2023.209.1.5svn56954-52.1.noarch.rpm"
RPM_HASH = "2da7162cff942c9caafa5036dca93571c79f01b89f7f9e575bbf22b49056eed7e4b989774d04d025b7541a73ef465862511638e8ec6be63b4218d9c29ac9c97f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-philosophersimprint-doc"

RDEPENDS:${PN} += ""

inherit rpm
