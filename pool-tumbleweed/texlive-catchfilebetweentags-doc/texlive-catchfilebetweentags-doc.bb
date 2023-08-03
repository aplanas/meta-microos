SUMMARY = "Documentation for texlive-catchfilebetweentags"
DESCRIPTION = "This package includes the documentation for texlive-catchfilebetweentags"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn21476"

RPM_NAME = "texlive-catchfilebetweentags-doc-2023.209.1.1svn21476-53.1.noarch.rpm"
RPM_HASH = "f6fa33469491ff50a6ea6d2c79916baf9f6af53c0742395cac7db2a42ce9a31763b8dd98dee7c7a813d8400778ce28d90bae43ca95a3f82b06e78f1cb3bbe0da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-catchfilebetweentags-doc"

RDEPENDS:${PN} += ""

inherit rpm
