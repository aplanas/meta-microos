SUMMARY = "Documentation for texlive-youngtab"
DESCRIPTION = "This package includes the documentation for texlive-youngtab"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn56500"

RPM_NAME = "texlive-youngtab-doc-2023.209.1.1svn56500-53.1.noarch.rpm"
RPM_HASH = "02939a7d88b65aa0c606a8246dca5c1edfec3a3d3db1c88aff8ce6c1cad6021bcd0eb4eebd8f8320678a489a862f6111a3b8b6bcef1c8a68305ab460f1cabc53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-youngtab-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
