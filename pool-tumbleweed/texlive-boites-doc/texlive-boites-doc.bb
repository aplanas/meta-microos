SUMMARY = "Documentation for texlive-boites"
DESCRIPTION = "This package includes the documentation for texlive-boites"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn32235"

RPM_NAME = "texlive-boites-doc-2023.201.1.1svn32235-52.1.noarch.rpm"
RPM_HASH = "cbef009b12086baebe40243543542ea126a82a35e2983d2369b4658c20f3eb6bcf48fd2351fb4ac7a379251e6913e5ef83e2bdfb004f35a8ab9a6b04d0c41641"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-boites-doc"

RDEPENDS:${PN} += ""

inherit rpm
