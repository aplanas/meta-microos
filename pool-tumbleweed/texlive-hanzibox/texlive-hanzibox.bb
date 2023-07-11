SUMMARY = "Boxed Chinese characters with Pinyin above and translation below"
DESCRIPTION = "This is a LaTeX package written to simplify the input of \
Chinese with Hanyu Pinyin and translation. Hanyu Pinyin is \
placed above Chinese with the xpinyin package, and the \
translation is placed below. The package can be used as a \
utility for learning to write and pronounce Chinese characters, \
for Chinese character learning plans, presentations, exercise \
booklets and other documentation work."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3.0svn63062"

RPM_NAME = "texlive-hanzibox-2023.201.2.3.0svn63062-53.2.noarch.rpm"
RPM_HASH = "7292d032b8ee2d9fea6d4e1fd154b4dbcfe9ba4ef34a7c00d945fd9c106588f3800ee3574b96f868e44c4cf56362a9e9ae1d94a2e11834df46ea30e2da0925c3"
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
