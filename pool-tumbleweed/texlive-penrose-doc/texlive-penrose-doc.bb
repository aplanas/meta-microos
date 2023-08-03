SUMMARY = "Documentation for texlive-penrose"
DESCRIPTION = "This package includes the documentation for texlive-penrose"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn57508"

RPM_NAME = "texlive-penrose-doc-2023.209.1.4svn57508-52.1.noarch.rpm"
RPM_HASH = "ef2020b3702154ba7f36c6c84d07bda3ca66f83d991a92ead7996ba219d18aee2ff75430fba9c663919ae4ddad756ebdd141fe68481e21fccce98775db421a6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-penrose-doc"

RDEPENDS:${PN} += ""

inherit rpm
