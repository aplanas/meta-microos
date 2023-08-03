SUMMARY = "Documentation for texlive-feyn"
DESCRIPTION = "This package includes the documentation for texlive-feyn"
LICENSE = "BSD-3-Clause"

PV = "2023.209.0.0.4.3svn63945"

RPM_NAME = "texlive-feyn-doc-2023.209.0.0.4.3svn63945-53.1.noarch.rpm"
RPM_HASH = "e962a8e32b89e466cad74e52a0d5d5c7517a7e93c778425a4ed08297932f2b6b5c0586f8d09e48eed4dce820d056148a8e15803800df29f811b15d38b2cc3036"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-feyn-doc"

RDEPENDS:${PN} += ""

inherit rpm
