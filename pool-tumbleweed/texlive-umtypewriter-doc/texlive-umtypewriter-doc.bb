SUMMARY = "Documentation for texlive-umtypewriter"
DESCRIPTION = "This package includes the documentation for texlive-umtypewriter"
LICENSE = "OFL-1.1"

PV = "2023.201.1.1svn64443"

RPM_NAME = "texlive-umtypewriter-doc-2023.201.1.1svn64443-53.1.noarch.rpm"
RPM_HASH = "fc61cb60384d86845b6f33a27faef134778c7d89bbc0cef1d05af11733d5a5af10f7715dc276f7d0f338f6dd778ce8cda31364d38a896c6819992fbd13a3371a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-umtypewriter-doc"

RDEPENDS:${PN} += ""

inherit rpm
