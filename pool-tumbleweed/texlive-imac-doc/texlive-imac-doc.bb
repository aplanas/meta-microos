SUMMARY = "Documentation for texlive-imac"
DESCRIPTION = "This package includes the documentation for texlive-imac"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn17347"

RPM_NAME = "texlive-imac-doc-2023.209.svn17347-54.1.noarch.rpm"
RPM_HASH = "308d0aab442d52f09343c5b923f518a5b0662273003bf34a8f4c4c4f1d185ddd9b2cf198a47d40d661cdcc1c7fbdf114bf8770cf59bd81e9660cfb38d6c082ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-imac-doc"

RDEPENDS:${PN} += ""

inherit rpm
