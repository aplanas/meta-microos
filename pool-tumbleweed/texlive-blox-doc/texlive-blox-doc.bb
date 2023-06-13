SUMMARY = "Documentation for texlive-blox"
DESCRIPTION = "This package includes the documentation for texlive-blox"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.51svn57949"

RPM_NAME = "texlive-blox-doc-2023.201.2.51svn57949-52.1.noarch.rpm"
RPM_HASH = "bd512dafb33bd65770b8be581c890967bb917ec753641322dcc9a3d40630b66deafc91026125b2dcf785009b338b7550aa174cf496fc2730956c66eb27c22727"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-blox-doc"

RDEPENDS:${PN} += ""

inherit rpm
