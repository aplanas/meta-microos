SUMMARY = "Documentation for texlive-courierten"
DESCRIPTION = "This package includes the documentation for texlive-courierten"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn55436"

RPM_NAME = "texlive-courierten-doc-2023.209.svn55436-55.1.noarch.rpm"
RPM_HASH = "d0cc52f93f56cd8052f80432484fded86509052ebbf4d4734be43beb08e96271936fe1967c1d8d3ad3dc42d1cd9a0588b6f151418858d5c75a7aca907fc3543c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-courierten-doc"

RDEPENDS:${PN} += ""

inherit rpm
