SUMMARY = "Documentation for texlive-tensind"
DESCRIPTION = "This package includes the documentation for texlive-tensind"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn51481"

RPM_NAME = "texlive-tensind-doc-2023.209.1.1svn51481-55.1.noarch.rpm"
RPM_HASH = "702a0376c0871cc50ddd4e26087a2aeb8699332c4891c83ce6f9b1400fa0aa3abced764ad6b1c66fedc39ad404d0e4e45dd475d8e22a2634f12538f046923187"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tensind-doc"

RDEPENDS:${PN} += ""

inherit rpm
