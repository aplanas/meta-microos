SUMMARY = "Documentation for texlive-polyglossia"
DESCRIPTION = "This package includes the documentation for texlive-polyglossia"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.60svn65792"

RPM_NAME = "texlive-polyglossia-doc-2023.201.1.60svn65792-52.1.noarch.rpm"
RPM_HASH = "e7e66bb1fd3f2663b9e40e0d77b0bc5332df41fd85f52d465da93fb43824ecbdd23b955752158fbd62db29a44bb737d97379e1c53191351a8499d7932472f030"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-polyglossia-doc"
RDEPENDS:${PN} += ""

inherit rpm
