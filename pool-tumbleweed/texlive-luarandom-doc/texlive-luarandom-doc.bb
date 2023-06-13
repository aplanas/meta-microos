SUMMARY = "Documentation for texlive-luarandom"
DESCRIPTION = "This package includes the documentation for texlive-luarandom"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn49419"

RPM_NAME = "texlive-luarandom-doc-2023.201.0.0.01svn49419-52.1.noarch.rpm"
RPM_HASH = "147e9fc62beccede5a652e80d2c3822430402156715e0c47f0d3e0beda5a6e527fc1a71def570cd4f7ae26eb926d64ff493a897e648d9ddcedb0007ba46b7240"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luarandom-doc"

RDEPENDS:${PN} += ""

inherit rpm
