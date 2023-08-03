SUMMARY = "Documentation for texlive-iscram"
DESCRIPTION = "This package includes the documentation for texlive-iscram"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn45801"

RPM_NAME = "texlive-iscram-doc-2023.209.1.1svn45801-56.1.noarch.rpm"
RPM_HASH = "922ec0fc061e718e9028770fd95d98a0adc552712183a827932be44d3c5230fd86617947e98900663a767bc9edd90af72f7201add2e7e680fd1d4f187f15d391"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iscram-doc"

RDEPENDS:${PN} += ""

inherit rpm
