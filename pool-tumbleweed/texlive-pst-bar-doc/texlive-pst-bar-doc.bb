SUMMARY = "Documentation for texlive-pst-bar"
DESCRIPTION = "This package includes the documentation for texlive-pst-bar"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.93svn64331"

RPM_NAME = "texlive-pst-bar-doc-2023.209.0.0.93svn64331-53.1.noarch.rpm"
RPM_HASH = "3c06244273f4f3783a7ffd30ae6bc0821fbeca71c77eec178ce27d7468a3ec5d4e187eea8d162b6c207a83825293891a94c70da143b76eb43d98e81927ef12d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-bar-doc"

RDEPENDS:${PN} += ""

inherit rpm
