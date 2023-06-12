SUMMARY = "Documentation for texlive-findhyph"
DESCRIPTION = "This package includes the documentation for texlive-findhyph"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.4svn47444"

RPM_NAME = "texlive-findhyph-doc-2023.201.3.4svn47444-52.1.noarch.rpm"
RPM_HASH = "ca729b09f0abcfd8ea4226446ec60f67a4299757027a3171076b062a242c8886109a61ddd9e7d3948ddba7da83c0933c1daafdc5963870ba74b4d89d4e6448c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(findhyph.1) \
texlive-findhyph-doc"
RDEPENDS:${PN} += ""

inherit rpm
