SUMMARY = "Documentation for texlive-harmony"
DESCRIPTION = "This package includes the documentation for texlive-harmony"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-harmony-doc-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "f0d3aa267b8151dfea76e410e517f13826c4be87281f24682dc9ced556966c5c56244fb1592d07ef4ba8b6fdedb79a5c79a449965016d7a915ac0556fea37d52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-harmony-doc"

RDEPENDS:${PN} += ""

inherit rpm
