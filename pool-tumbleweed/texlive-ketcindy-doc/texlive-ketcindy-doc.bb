SUMMARY = "Documentation for texlive-ketcindy"
DESCRIPTION = "This package includes the documentation for texlive-ketcindy"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.20191225.0svn58661"

RPM_NAME = "texlive-ketcindy-doc-2023.209.20191225.0svn58661-56.1.noarch.rpm"
RPM_HASH = "a71139da761090170dd853d889937ec4606ab5fed47afebfc7befa875fbe1b8e5ca13aa48f8f2d0640e954c83787a504a54f32d81cea08af91c479aabf69bd0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ketcindy-doc-ja \
texlive-ketcindy-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
