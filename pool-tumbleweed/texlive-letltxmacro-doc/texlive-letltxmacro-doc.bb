SUMMARY = "Documentation for texlive-letltxmacro"
DESCRIPTION = "This package includes the documentation for texlive-letltxmacro"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn53022"

RPM_NAME = "texlive-letltxmacro-doc-2023.201.1.6svn53022-54.1.noarch.rpm"
RPM_HASH = "2c4abfe49786b89c0d2b78144c6cbf4c9b1abe90edc31207d96e89b685f5b0e2f13b0b1c46ba63dc08c13b5e8207f3b063b584698814bfcf7bfbb308bbcd7475"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-letltxmacro-doc-en \
texlive-letltxmacro-doc"

RDEPENDS:${PN} += ""

inherit rpm
