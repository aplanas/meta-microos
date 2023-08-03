SUMMARY = "Documentation for texlive-songs"
DESCRIPTION = "This package includes the documentation for texlive-songs"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.1svn51494"

RPM_NAME = "texlive-songs-doc-2023.209.3.1svn51494-58.1.noarch.rpm"
RPM_HASH = "29689fcdfe4bf820475816d2d2b7ed3bee8580cfca91c2ddfec6b269f18be853f7ab767277c6a4442e17ca4b67bd3471ddaf2f59a864620a099c99bf5e2c9cf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-songs-doc"

RDEPENDS:${PN} += ""

inherit rpm
