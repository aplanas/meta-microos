SUMMARY = "Typesetting keepachangelog.com style changelogs"
DESCRIPTION = "This package provides a changelog environment (which itself \
provides a version environment) to represent a changelog. The \
package supports multiple authors, unreleased changes, and \
yanked (revoked) releases. Inspired by keepachangelog.com."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.5.0svn65861"

RPM_NAME = "texlive-changelog-2023.209.2.5.0svn65861-53.1.noarch.rpm"
RPM_HASH = "b16f87389ac3158be844a6f9465f800e43018ed7ae9df2274cd9168fc670374f491919a60f0d77e31c83582851745c7ad5d94ac67fadd0218bfd8d92e07bfe89"
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
