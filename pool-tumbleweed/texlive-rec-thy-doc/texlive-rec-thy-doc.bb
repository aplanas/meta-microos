SUMMARY = "Documentation for texlive-rec-thy"
DESCRIPTION = "This package includes the documentation for texlive-rec-thy"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.3.8.2svn63982"

RPM_NAME = "texlive-rec-thy-doc-2023.201.3.8.2svn63982-53.2.noarch.rpm"
RPM_HASH = "d67175376f1f394b61036b2a3ed177f05c71dbf812962c1f30f484aad54334a61e1b9ef2742eb6bc9371b31679743b281620bd87f12da191bf5e0e7982556fb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rec-thy-doc"

RDEPENDS:${PN} += ""

inherit rpm
