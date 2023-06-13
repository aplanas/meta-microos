SUMMARY = "Documentation for texlive-context-algorithmic"
DESCRIPTION = "This package includes the documentation for texlive-context-algorithmic"
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-algorithmic-doc-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "1eaffb75774c112b83f72c1ddb6471532b1fc131f7e2b5c11db24fb90c87094d42b206738ae666e723144487ad9cdc37cba9719d21b14a35bc28d6952a2900ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-algorithmic-doc"

RDEPENDS:${PN} += ""

inherit rpm
