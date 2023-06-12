SUMMARY = "Documentation for texlive-poetrytex"
DESCRIPTION = "This package includes the documentation for texlive-poetrytex"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0.1svn39921"

RPM_NAME = "texlive-poetrytex-doc-2023.201.3.0.1svn39921-52.1.noarch.rpm"
RPM_HASH = "b731907a2e54716162933bd43b5b67bbfa5d0fa660b374c5a383c1f362eee45d94e5a6ba780440c839c0ab1067ea9ccf257a59ee47fdea595af132675c188707"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-poetrytex-doc"
RDEPENDS:${PN} += ""

inherit rpm
