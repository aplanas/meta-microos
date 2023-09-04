SUMMARY = "Documentation for texlive-xytree"
DESCRIPTION = "This package includes the documentation for texlive-xytree"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn15878"

RPM_NAME = "texlive-xytree-doc-2023.209.1.5svn15878-53.2.noarch.rpm"
RPM_HASH = "b89bc346d25d05d5f13827987945167c2ee42e8bfeabff856a5a1b27d86ac5d5d22c288e356681adc751dcf1dc9c728faa3b08a839f965d5bdb090037ee222ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xytree-doc-en \
texlive-xytree-doc"

RDEPENDS:${PN} += ""

inherit rpm
