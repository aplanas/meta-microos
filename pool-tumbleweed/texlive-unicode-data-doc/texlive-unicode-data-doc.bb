SUMMARY = "Documentation for texlive-unicode-data"
DESCRIPTION = "This package includes the documentation for texlive-unicode-data"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.16svn64423"

RPM_NAME = "texlive-unicode-data-doc-2023.201.1.16svn64423-53.1.noarch.rpm"
RPM_HASH = "a53d4d98b89a393c53335e8e149a86cc20f94b2b89856ed891ac95012925a3772b7537982c259c30533574892cd2b8ef2922948b17317c02975f45d09754d530"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unicode-data-doc"
RDEPENDS:${PN} += ""

inherit rpm
