SUMMARY = "Documentation for texlive-bbm-macros"
DESCRIPTION = "This package includes the documentation for texlive-bbm-macros"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn17224"

RPM_NAME = "texlive-bbm-macros-doc-2023.209.svn17224-54.1.noarch.rpm"
RPM_HASH = "b2497005b833b3f5e137481259541b898b91e23a0251f19481d52008b81655a2a827a9f252c8a3093f050f77b87af5d14caa28f72413b93c04b3f6db4dd68e1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bbm-macros-doc"

RDEPENDS:${PN} += ""

inherit rpm
