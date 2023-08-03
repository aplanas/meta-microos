SUMMARY = "Documentation for texlive-braket"
DESCRIPTION = "This package includes the documentation for texlive-braket"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn17127"

RPM_NAME = "texlive-braket-doc-2023.209.svn17127-53.1.noarch.rpm"
RPM_HASH = "f897ecd7d86e1fee99f545182661cee52a96ace2f6c8f7789ed29af3c113b975194d2f7cd720f3e6a04428e72adc35baf93c41383644730a6432eb4055ebab41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-braket-doc"

RDEPENDS:${PN} += ""

inherit rpm
