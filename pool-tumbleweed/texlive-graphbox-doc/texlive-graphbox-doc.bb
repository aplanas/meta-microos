SUMMARY = "Documentation for texlive-graphbox"
DESCRIPTION = "This package includes the documentation for texlive-graphbox"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn46360"

RPM_NAME = "texlive-graphbox-doc-2023.209.1.1svn46360-54.1.noarch.rpm"
RPM_HASH = "02e038fd23e45bdfd6b6d57c9688db37dba75ec3726d724077661dbd1ec6a6e268ad4ca51435537b3c6d19eef1d8e8bf94cea3721e20c77b95a32af1f317cb1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
