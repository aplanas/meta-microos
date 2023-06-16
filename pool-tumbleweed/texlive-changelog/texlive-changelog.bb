SUMMARY = "Typesetting keepachangelog.com style changelogs"
DESCRIPTION = "This package provides a changelog environment (which itself \
provides a version environment) to represent a changelog. The \
package supports multiple authors, unreleased changes, and \
yanked (revoked) releases. Inspired by keepachangelog.com."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.5.0svn65861"

RPM_NAME = "texlive-changelog-2023.201.2.5.0svn65861-52.1.noarch.rpm"
RPM_HASH = "a881209c1c72b74abae37635a02b03be0ee424127f90e8c59a26bc2aeb038adf1e3f4ab9a780689f6ad19a9070717d7b898b892256df9daf28a95a349479689b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-changelog.sty \
texlive-changelog"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-translations.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
