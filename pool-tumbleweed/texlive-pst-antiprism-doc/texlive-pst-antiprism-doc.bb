SUMMARY = "Documentation for texlive-pst-antiprism"
DESCRIPTION = "This package includes the documentation for texlive-pst-antiprism"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn46643"

RPM_NAME = "texlive-pst-antiprism-doc-2023.201.0.0.02svn46643-52.1.noarch.rpm"
RPM_HASH = "c3472f4b9e7964dd4fac970b2f56eca10bd7c4b73b91dd79b75f83e7efc9c143cfed1fb796c1fb2c5bc32c735f972f35f33075aa0dd4a1cb8e0fffff2713f8f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-antiprism-doc"
RDEPENDS:${PN} += ""

inherit rpm
