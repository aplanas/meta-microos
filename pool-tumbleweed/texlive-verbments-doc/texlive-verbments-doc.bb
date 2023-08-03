SUMMARY = "Documentation for texlive-verbments"
DESCRIPTION = "This package includes the documentation for texlive-verbments"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn23670"

RPM_NAME = "texlive-verbments-doc-2023.209.1.2svn23670-54.1.noarch.rpm"
RPM_HASH = "10a68930ea1e8155e13157e042c1577ee7afd752835d77e0dbe98741199a89ca65ad6967a868afb7ba012c8f4d8c992e40fc4220e838316f98bec62502982675"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-verbments-doc"

RDEPENDS:${PN} += ""

inherit rpm
