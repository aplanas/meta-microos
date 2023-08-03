SUMMARY = "Documentation for texlive-preview"
DESCRIPTION = "This package includes the documentation for texlive-preview"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.13.1svn62130"

RPM_NAME = "texlive-preview-doc-2023.209.13.1svn62130-53.1.noarch.rpm"
RPM_HASH = "0a0b8ca91871376594453b8fd22cd91fc699b69dd59ee8606baaf6caa748ed9cd5b5243b84f4a1ccf9da0cf64078ae70e57659822ae32f2db0be5e3a138c8a83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-preview-doc"

RDEPENDS:${PN} += ""

inherit rpm
