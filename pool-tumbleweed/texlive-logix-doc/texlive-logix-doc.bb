SUMMARY = "Documentation for texlive-logix"
DESCRIPTION = "This package includes the documentation for texlive-logix"
LICENSE = "OFL-1.1"

PV = "2023.201.1.13svn63688"

RPM_NAME = "texlive-logix-doc-2023.201.1.13svn63688-54.1.noarch.rpm"
RPM_HASH = "a7668b0cddbe5a65bfb2e7d71717afba060ff36ab34639d85c8874bbdbe40602ee863ce745750cd428fd778643a589d90f75af5bf146c6db9192fa57c8e3a0e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-logix-doc"
RDEPENDS:${PN} += ""

inherit rpm
