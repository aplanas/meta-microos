SUMMARY = "Documentation for texlive-inkpaper"
DESCRIPTION = "This package includes the documentation for texlive-inkpaper"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn54080"

RPM_NAME = "texlive-inkpaper-doc-2023.209.1.0svn54080-54.1.noarch.rpm"
RPM_HASH = "4cd58575d40ec6b0248366599eca4a8ae2a8a4e6bc12d2acd337e5098c0e1a2a187d1d1c0a98bc0a32fea0325403d72370a05264f97a7aebc5d6eb2a82bb28f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-inkpaper-doc-zh-cn;en \
texlive-inkpaper-doc"

RDEPENDS:${PN} += ""

inherit rpm
