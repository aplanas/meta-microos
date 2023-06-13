SUMMARY = "Documentation for texlive-truthtable"
DESCRIPTION = "This package includes the documentation for texlive-truthtable"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.2svn60717"

RPM_NAME = "texlive-truthtable-doc-2023.201.0.0.0.2svn60717-52.1.noarch.rpm"
RPM_HASH = "db13fe8cc8768dd307ba14467ee2c4f38fdd10ca23d5a8f01985689ed5445762f137047d2643f6abac912d4441db39aa426fb1beda5063740c3562a24f3f5417"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-truthtable-doc"

RDEPENDS:${PN} += ""

inherit rpm
