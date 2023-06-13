SUMMARY = "Documentation for texlive-musikui"
DESCRIPTION = "This package includes the documentation for texlive-musikui"
LICENSE = "LPPL-1.0"

PV = "2023.201.1svn47472"

RPM_NAME = "texlive-musikui-doc-2023.201.1svn47472-54.1.noarch.rpm"
RPM_HASH = "10d192a3ef03f398e2841045ae515b9cd294f95ac7af1b27808ccc22aa94cd5979dbe227327d49bf96165101ea239f861efa4664d8e3566c1f2e7989cb63d9d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-musikui-doc"

RDEPENDS:${PN} += ""

inherit rpm
