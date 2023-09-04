SUMMARY = "Documentation for texlive-econ-bst"
DESCRIPTION = "This package includes the documentation for texlive-econ-bst"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1.1svn61499"

RPM_NAME = "texlive-econ-bst-doc-2023.209.3.1.1svn61499-54.2.noarch.rpm"
RPM_HASH = "686bb4e61bcd091e3cb3aa7bcfb2b0a72bca62ea20c2b65e8c344ea55e7b7dc267f6c06c86a7fd94f1c3b3ebfb7f2a168ad947812a3cb6286557415f25e7d4fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-econ-bst-doc"

RDEPENDS:${PN} += ""

inherit rpm
