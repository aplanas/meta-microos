SUMMARY = "Documentation for texlive-mylatex"
DESCRIPTION = "This package includes the documentation for texlive-mylatex"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn56751"

RPM_NAME = "texlive-mylatex-doc-2023.209.svn56751-55.1.noarch.rpm"
RPM_HASH = "bdac456bf35d5cab8afeecf9fbce78b60daaaf6339240401de9daab171d70abebd0d5735ebcd191d981e55f0751fbe34e70d3ca72aaf128b1e97d9a116a346c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mylatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
