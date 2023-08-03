SUMMARY = "Documentation for texlive-theoremref"
DESCRIPTION = "This package includes the documentation for texlive-theoremref"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54512"

RPM_NAME = "texlive-theoremref-doc-2023.209.svn54512-55.1.noarch.rpm"
RPM_HASH = "3c023f1450363fe347c0e6ea1f441c745f5db7cc4c8403eca1b7847fe5618d92ad1165424697356bbe99d46ac7e9dbb8544fa9431dc52c95eec15383f61c4b7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-theoremref-doc"

RDEPENDS:${PN} += ""

inherit rpm
