SUMMARY = "Documentation for texlive-uni-titlepage"
DESCRIPTION = "This package includes the documentation for texlive-uni-titlepage"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn64306"

RPM_NAME = "texlive-uni-titlepage-doc-2023.209.1.1asvn64306-54.1.noarch.rpm"
RPM_HASH = "eb79caac9061f96643a6a40aa15d2c71b6c37b2f66bb48ddb65836324ea640ebd763d4efdfeb2f06e58197c1d770b1fb601165e797e40c4c18b2cbe45a1af543"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uni-titlepage-doc"

RDEPENDS:${PN} += ""

inherit rpm
