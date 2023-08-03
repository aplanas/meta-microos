SUMMARY = "Documentation for texlive-biblatex-lncs"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-lncs"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6svn65280"

RPM_NAME = "texlive-biblatex-lncs-doc-2023.209.0.0.6svn65280-54.1.noarch.rpm"
RPM_HASH = "6a60520491ff4777c6ae55878839bd0274a748bffb0be2c33aa107dfeffa828bd32aeb2412536ed0432ab70f1705a5903d5c8f673f8328253d5aa8f86bbeda90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-lncs-doc"

RDEPENDS:${PN} += ""

inherit rpm
