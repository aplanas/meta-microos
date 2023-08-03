SUMMARY = "Documentation for texlive-derivative"
DESCRIPTION = "This package includes the documentation for texlive-derivative"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn63850"

RPM_NAME = "texlive-derivative-doc-2023.209.1.2svn63850-53.1.noarch.rpm"
RPM_HASH = "fb09997fab77d40c0d35aa9174a8b592b4b3b2187a763f54cf746c90b7ad08ee10a33d5f4edfdd5ef53c528ebea673019aa401f7150ac3041658cddc870a8161"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-derivative-doc"

RDEPENDS:${PN} += ""

inherit rpm
