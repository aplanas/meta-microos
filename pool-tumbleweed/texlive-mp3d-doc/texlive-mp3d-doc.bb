SUMMARY = "Documentation for texlive-mp3d"
DESCRIPTION = "This package includes the documentation for texlive-mp3d"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.34svn29349"

RPM_NAME = "texlive-mp3d-doc-2023.209.1.34svn29349-55.1.noarch.rpm"
RPM_HASH = "7ff4278da6c390920296b91276a361b56734eeb0a803bde3ad600bd3a9604d950ce27ba6b828fbcd37fe256be2b1769a473db8a0cfefb1ac24e3cb6898ce4704"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-mp3d-doc-fr;en \
texlive-mp3d-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
