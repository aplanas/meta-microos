SUMMARY = "Documentation for texlive-mylatexformat"
DESCRIPTION = "This package includes the documentation for texlive-mylatexformat"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.4svn21392"

RPM_NAME = "texlive-mylatexformat-doc-2023.201.3.4svn21392-54.1.noarch.rpm"
RPM_HASH = "7c61ab802d700a0ed5aebcd8c7031223afede2381fcf4e75fb758efb36feebcb2183b8112cfef82c9f0ff1ddc41afc3119d0c22bf1003019034684a4adc01f3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mylatexformat-doc"

RDEPENDS:${PN} += ""

inherit rpm
