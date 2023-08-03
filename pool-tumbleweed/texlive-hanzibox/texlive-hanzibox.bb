SUMMARY = "Boxed Chinese characters with Pinyin above and translation below"
DESCRIPTION = "This is a LaTeX package written to simplify the input of \
Chinese with Hanyu Pinyin and translation. Hanyu Pinyin is \
placed above Chinese with the xpinyin package, and the \
translation is placed below. The package can be used as a \
utility for learning to write and pronounce Chinese characters, \
for Chinese character learning plans, presentations, exercise \
booklets and other documentation work."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3.0svn63062"

RPM_NAME = "texlive-hanzibox-2023.209.2.3.0svn63062-54.1.noarch.rpm"
RPM_HASH = "0c8ae6f08f7c6dc3f7bf011ec62f7c4bd004d257c702b07140a0eff017a190cd40ef823553eb8221bac82d9c5b0662ab99f27f4ea37e537b87164f477b23561e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hanzibox.sty \
texlive-hanzibox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3draw.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
tex-xpinyin.sty \
tex-xtemplate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
