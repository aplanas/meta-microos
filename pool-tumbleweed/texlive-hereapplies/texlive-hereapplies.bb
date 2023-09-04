SUMMARY = "A LaTeX package for referencing groups of pages that share something in common"
DESCRIPTION = "Here Applies is a LaTeX package that allows to collect groups \
of labels and reference them altogether. It can be used for \
creating informal glossaries that cross-link concepts to their \
applications, or simply mentioning multiple pages that share \
something in common."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0.1svn65251"

RPM_NAME = "texlive-hereapplies-2023.209.1.0.1svn65251-54.2.noarch.rpm"
RPM_HASH = "65e808ea5dc1e5f7399bc215149868b362cdd89ae975912757538a647b537bfa58ccc4e36596d06463bfcfefa36a1f4ee67e2041470a6235b3741b9ecc7bbd88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hereapplies.sty \
texlive-hereapplies"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
tex-refcount.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
