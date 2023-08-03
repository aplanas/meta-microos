SUMMARY = "Documentation for texlive-metapost-colorbrewer"
DESCRIPTION = "This package includes the documentation for texlive-metapost-colorbrewer"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn48753"

RPM_NAME = "texlive-metapost-colorbrewer-doc-2023.209.svn48753-55.1.noarch.rpm"
RPM_HASH = "feb8dad7750a37bcfa7c0f14a7b96877b3396f877ff03f5d51fcec07b29f4c5361cc7cbfd6c434cf1a80853e8cb56df85baa35f967c29b928f36e31313793c67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metapost-colorbrewer-doc"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
