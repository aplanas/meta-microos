SUMMARY = "Key-value parsing combining features of xkeyval and pgfkeys"
DESCRIPTION = "The package integrates the features of xkeyval and of pgfkeys \
by introducing a new type of handlers. Style keys, links, \
changing key callbacks and values on the fly, and other \
features of pgfkeys are introduced in a new context."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn30560"

RPM_NAME = "texlive-skeyval-2023.201.1.3svn30560-57.1.noarch.rpm"
RPM_HASH = "65adb867db369042df537cb9e23f8b3da0ece846df8bcee3b5d0da80b8231ebc97a6713159c48bf11b4199d1cfe0f699c3ea8f1e518a38769275356906a6c770"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-skeyval-bc.sty \
tex-skeyval-core.tex \
tex-skeyval-for.tex \
tex-skeyval-ltxcmds.tex \
tex-skeyval-ltxpatch.sty \
tex-skeyval-pstkey.sty \
tex-skeyval-pstkey.tex \
tex-skeyval-testclass.cls \
tex-skeyval-testpkg.sty \
tex-skeyval-view.sty \
tex-skeyval.sty \
texlive-skeyval"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-atveryend.sty \
tex-graphicx.sty \
tex-longtable.sty \
tex-pifont.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
