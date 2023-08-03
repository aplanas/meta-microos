SUMMARY = "Documentation for texlive-pst-calendar"
DESCRIPTION = "This package includes the documentation for texlive-pst-calendar"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.48svn60480"

RPM_NAME = "texlive-pst-calendar-doc-2023.209.0.0.48svn60480-53.1.noarch.rpm"
RPM_HASH = "19ebbc7759a88011c998b7aa3d71445ee923f8d68d30143f9bf4d615ee032b02c1ef6286e4cee6f31444b2b9633adebc31226f0c633806e1849014bc6e5640f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-calendar-doc"

RDEPENDS:${PN} += ""

inherit rpm
