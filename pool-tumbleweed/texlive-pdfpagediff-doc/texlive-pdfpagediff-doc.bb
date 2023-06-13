SUMMARY = "Documentation for texlive-pdfpagediff"
DESCRIPTION = "This package includes the documentation for texlive-pdfpagediff"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn37946"

RPM_NAME = "texlive-pdfpagediff-doc-2023.201.1.4svn37946-51.1.noarch.rpm"
RPM_HASH = "a821a9f5fc5354ce14d3268506f2f5ee89f9fc3f63c09ec7af0e56edb2c7c2828e72637ea3929f0d8f134fffd48bdbfa8c52edca49fe69a646e0e9f7e954cf2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfpagediff-doc"

RDEPENDS:${PN} += ""

inherit rpm
