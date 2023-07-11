SUMMARY = "Documentation for texlive-pyluatex"
DESCRIPTION = "This package includes the documentation for texlive-pyluatex"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6.1svn65855"

RPM_NAME = "texlive-pyluatex-doc-2023.201.0.0.6.1svn65855-53.2.noarch.rpm"
RPM_HASH = "c8c914eec55ae072472c675d95cbd2ed51e4be38d293f8726dd08b1e151b5adc2f59ffd6180fd04d5176eec5cee36434022ce48afc56a9e8e7168f576864f763"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pyluatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
