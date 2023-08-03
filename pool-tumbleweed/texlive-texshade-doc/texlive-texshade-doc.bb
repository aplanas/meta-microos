SUMMARY = "Documentation for texlive-texshade"
DESCRIPTION = "This package includes the documentation for texlive-texshade"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.26asvn64242"

RPM_NAME = "texlive-texshade-doc-2023.209.1.26asvn64242-55.1.noarch.rpm"
RPM_HASH = "bad3d512c8c1ccd38a0d41881978b3e5c0b72616959c7623ddab6af5f2ac28aa605633600f29f154adac12eec3f2dbe17635274c90d1d2da3f3767ea8f88d3d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-texshade-doc-en \
texlive-texshade-doc"

RDEPENDS:${PN} += ""

inherit rpm
