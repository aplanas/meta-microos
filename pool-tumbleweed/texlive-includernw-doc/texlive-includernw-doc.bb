SUMMARY = "Documentation for texlive-includernw"
DESCRIPTION = "This package includes the documentation for texlive-includernw"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.0svn47557"

RPM_NAME = "texlive-includernw-doc-2023.209.0.0.1.0svn47557-54.1.noarch.rpm"
RPM_HASH = "3470ff9298ea8fc7af568b54790757b2a9858f43474e2293a1f036465856fae183add6d3bc74591ef71c09bc866292699ff57a27c42078b70d0431becc5bc6f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-includernw-doc"

RDEPENDS:${PN} += ""

inherit rpm
