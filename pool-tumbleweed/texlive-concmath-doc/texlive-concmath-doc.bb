SUMMARY = "Documentation for texlive-concmath"
DESCRIPTION = "This package includes the documentation for texlive-concmath"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn17219"

RPM_NAME = "texlive-concmath-doc-2023.209.svn17219-54.1.noarch.rpm"
RPM_HASH = "b95e7fb71bf393dd35e7b3dc7f64a1cf0788ba752237bfd4fa2aa39d9f85c92d8af830000b5c5faa4e0b01fbe4bdd6881d86c946811c76dbcf1b4985a41d0cae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-concmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
