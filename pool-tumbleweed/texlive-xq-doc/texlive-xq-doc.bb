SUMMARY = "Documentation for texlive-xq"
DESCRIPTION = "This package includes the documentation for texlive-xq"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn35211"

RPM_NAME = "texlive-xq-doc-2023.209.0.0.4svn35211-53.2.noarch.rpm"
RPM_HASH = "281df76e8070b33dd0ccc98a931a1427f96d573dbe3476c4af0a2da19f7ddab9d27ba5a7ff6ce7bcee98760dcaefd30e1f77d7ec790ba379f45331c4ed6b7387"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xq-doc"

RDEPENDS:${PN} += ""

inherit rpm
