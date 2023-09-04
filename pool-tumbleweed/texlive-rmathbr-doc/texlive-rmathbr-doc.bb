SUMMARY = "Documentation for texlive-rmathbr"
DESCRIPTION = "This package includes the documentation for texlive-rmathbr"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.1svn57173"

RPM_NAME = "texlive-rmathbr-doc-2023.209.1.1.1svn57173-54.2.noarch.rpm"
RPM_HASH = "40fb756976209fd94e76f9b465e164503d2583a9ef0b99eaafbec8a1a89de1c2c0fa68e37a189719e6213860c5b825e98274f944c18cf2aeec6bdda8e923aca5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rmathbr-doc"

RDEPENDS:${PN} += ""

inherit rpm
