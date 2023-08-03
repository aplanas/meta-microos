SUMMARY = "Documentation for texlive-bidipagegrid"
DESCRIPTION = "This package includes the documentation for texlive-bidipagegrid"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn34632"

RPM_NAME = "texlive-bidipagegrid-doc-2023.209.0.0.2svn34632-54.1.noarch.rpm"
RPM_HASH = "2cb746ff30a6d98138a6abf9e36cd086cd92fe50f6881d9e92a070a3b262ee834eaaad6e74f523d31b1e394439511bdeb6b7dd5baf9b97240a247c26cff1e87f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bidipagegrid-doc"

RDEPENDS:${PN} += ""

inherit rpm
