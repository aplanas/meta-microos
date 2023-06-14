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

RPM_NAME = "texlive-hanzibox-2023.201.2.3.0svn63062-53.1.noarch.rpm"
RPM_HASH = "db83e5f7e74eb4905f8b4a142ac66e343ad3cbde1c40fa1a92bd28b7c3f37368da5dd530cb4dfaaa549078af112bf6fcce4aa5ec6b4c3db2d9d17d559ec809ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hanzibox.sty \
texlive-hanzibox"

RDEPENDS:${PN} += "/bin/sh \
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
