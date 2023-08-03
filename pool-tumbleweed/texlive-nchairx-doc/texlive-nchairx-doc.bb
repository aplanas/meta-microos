SUMMARY = "Documentation for texlive-nchairx"
DESCRIPTION = "This package includes the documentation for texlive-nchairx"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn60196"

RPM_NAME = "texlive-nchairx-doc-2023.209.1.0.0svn60196-55.1.noarch.rpm"
RPM_HASH = "3e1e10e8a89eb724bc2877108a9db0b41665890115bc666d1e7e11fabbb6da29d37fc6d15be960a85edb29d5bab89e0ec5e7811fa7d0e55ce06390563de0ee97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nchairx-doc"

RDEPENDS:${PN} += ""

inherit rpm
