SUMMARY = "Documentation for texlive-chs-physics-report"
DESCRIPTION = "This package includes the documentation for texlive-chs-physics-report"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn54512"

RPM_NAME = "texlive-chs-physics-report-doc-2023.201.svn54512-53.1.noarch.rpm"
RPM_HASH = "0c994531cc8ac7b37124fe843ca7c5424d84548a7875b7ae67bd56d89492126aa03c5504ad3527cc1bb64dc9ce0c5b8caa1886f0b2c7980aba5034dbfccdcdaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chs-physics-report-doc"

RDEPENDS:${PN} += ""

inherit rpm
