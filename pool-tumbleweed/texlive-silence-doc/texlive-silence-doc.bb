SUMMARY = "Documentation for texlive-silence"
DESCRIPTION = "This package includes the documentation for texlive-silence"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5bsvn27028"

RPM_NAME = "texlive-silence-doc-2023.201.1.5bsvn27028-53.1.noarch.rpm"
RPM_HASH = "183b78a1fdd46344c3412a3b6e999d251dfc353e091ea109cc78dd2276ed72ba3e7f2f61f8d34e3f04a81121bf5a856e52e5e37c2ac10d46c240eee423bcda9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-silence-doc"

RDEPENDS:${PN} += ""

inherit rpm
