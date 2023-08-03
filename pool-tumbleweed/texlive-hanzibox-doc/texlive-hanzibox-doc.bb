SUMMARY = "Documentation for texlive-hanzibox"
DESCRIPTION = "This package includes the documentation for texlive-hanzibox"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3.0svn63062"

RPM_NAME = "texlive-hanzibox-doc-2023.209.2.3.0svn63062-54.1.noarch.rpm"
RPM_HASH = "f781bd3efbfc4d7de84dec5ac62feff2839ced8a5586e8515d46e1602baa08cc9205a5078a5495de1583767dae1fe354ddbe04d16dbea8d727d415b3941d4e34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hanzibox-doc-zh \
texlive-hanzibox-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
