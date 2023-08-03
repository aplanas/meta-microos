SUMMARY = "Documentation for texlive-context-cmttbf"
DESCRIPTION = "This package includes the documentation for texlive-context-cmttbf"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-cmttbf-doc-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "ac3d821d9b735fe7853f6ae7cc7e353139e79a0312e885725d915fa9cff7b37dd4ad926c4b777905ee8546daa3536871d47caf8f6024575d6b63829898bd6443"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-cmttbf-doc"

RDEPENDS:${PN} += ""

inherit rpm
