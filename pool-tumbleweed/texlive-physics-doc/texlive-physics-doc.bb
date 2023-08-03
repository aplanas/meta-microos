SUMMARY = "Documentation for texlive-physics"
DESCRIPTION = "This package includes the documentation for texlive-physics"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn28590"

RPM_NAME = "texlive-physics-doc-2023.209.1.3svn28590-52.1.noarch.rpm"
RPM_HASH = "ef80a53de1f18d566caae5f872b25e1a8c7b994ea8084af94fc598039c90862da8848864b68d22e3a1c382e7291e926e273e362a756f49cf77ac3101e4b74da2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-physics-doc"

RDEPENDS:${PN} += ""

inherit rpm
