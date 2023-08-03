SUMMARY = "A selection of layout styles"
DESCRIPTION = "The package provides several page layouts, selectable by \
package options."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn53207"

RPM_NAME = "texlive-fjodor-2023.209.svn53207-53.1.noarch.rpm"
RPM_HASH = "ef2aacea95e556e139c3baecce638c5a538d3a5aefba772ce1bfd85c42b98945f5269e3ae593edd1365cdfd1806c38dc75eb0af931d3eacbe4dfffd9af23f5ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fjodor.sty \
texlive-fjodor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
