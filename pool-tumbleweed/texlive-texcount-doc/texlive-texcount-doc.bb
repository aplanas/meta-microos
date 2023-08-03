SUMMARY = "Documentation for texlive-texcount"
DESCRIPTION = "This package includes the documentation for texlive-texcount"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1.1svn49013"

RPM_NAME = "texlive-texcount-doc-2023.209.3.1.1svn49013-55.1.noarch.rpm"
RPM_HASH = "f9d2721c6cc1b6ea69b18cdda3700e172852f2ea0ca877b2699ea865ee85afd5d81a4e78f987d7bcf0d2fde136f77f5d06679721f09df809af5f32236e9fc7b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texcount-doc"

RDEPENDS:${PN} += ""

inherit rpm
