SUMMARY = "Documentation for texlive-colophon"
DESCRIPTION = "This package includes the documentation for texlive-colophon"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn47913"

RPM_NAME = "texlive-colophon-doc-2023.209.1.1svn47913-54.1.noarch.rpm"
RPM_HASH = "08e714210840e8cd73d5210cb52c160e577e8b9f179817fc30ccc0ae42d81a02b82d8a697d86b6d4d203bfd042d1ec2a79d1bae5f1883060f4ff40ec6ffdde1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colophon-doc"

RDEPENDS:${PN} += ""

inherit rpm
