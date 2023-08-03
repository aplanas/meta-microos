SUMMARY = "Documentation for texlive-exercisebank"
DESCRIPTION = "This package includes the documentation for texlive-exercisebank"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.0svn50448"

RPM_NAME = "texlive-exercisebank-doc-2023.209.0.0.3.0svn50448-53.1.noarch.rpm"
RPM_HASH = "a8b98989bfa97cec5f0c7dc82c2df11577f5e701854a96cc15db6e423b930953c2552cc05f78cdc337e03b83604f529a234af4b5301450a934965e53c9668978"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exercisebank-doc"

RDEPENDS:${PN} += ""

inherit rpm
