SUMMARY = "Key-value parsing combining features of xkeyval and pgfkeys"
DESCRIPTION = "The package integrates the features of xkeyval and of pgfkeys \
by introducing a new type of handlers. Style keys, links, \
changing key callbacks and values on the fly, and other \
features of pgfkeys are introduced in a new context."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn30560"

RPM_NAME = "texlive-skeyval-2023.209.1.3svn30560-58.1.noarch.rpm"
RPM_HASH = "4e29a4b56d0f00ad7b9deb961a721290b3949b022363434c821ed3935d3bd635e96acdf48185b9ad044e2dc37c0370ca2780cd8eda6d43868209c318139d51eb"
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
