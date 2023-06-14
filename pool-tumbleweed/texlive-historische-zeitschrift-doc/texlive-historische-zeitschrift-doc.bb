SUMMARY = "Documentation for texlive-historische-zeitschrift"
DESCRIPTION = "This package includes the documentation for texlive-historische-zeitschrift"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn42635"

RPM_NAME = "texlive-historische-zeitschrift-doc-2023.201.1.2svn42635-53.1.noarch.rpm"
RPM_HASH = "463bb89936bd59b1494a3608e4fc67bc18069bf5b639fcb8efc8662141dbed5c18315ca3ace7b4cd3e2ab6c64428b45bd84055a0b93413d5d2a6b5babafd4a16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-historische-zeitschrift-doc-de;en \
texlive-historische-zeitschrift-doc"

RDEPENDS:${PN} += ""

inherit rpm
