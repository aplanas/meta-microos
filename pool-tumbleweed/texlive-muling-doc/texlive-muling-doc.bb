SUMMARY = "Documentation for texlive-muling"
DESCRIPTION = "This package includes the documentation for texlive-muling"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn61719"

RPM_NAME = "texlive-muling-doc-2023.201.0.0.3svn61719-54.1.noarch.rpm"
RPM_HASH = "6f2fa3bf7ae83ae33037cdb8fc184fdbf7152a2c367c60be953d8b256b1e4054b63b54563db416bd7ec44d3bf6f1af5f42e60250263426ddec2ef14b4c31e34b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-muling-doc"

RDEPENDS:${PN} += ""

inherit rpm
