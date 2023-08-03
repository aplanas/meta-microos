SUMMARY = "LaTeX package for multiple-choice questions"
DESCRIPTION = "This package adjusts the choices of the multiple-choice \
question automatically. It has been wholly inspired by the work \
of Enrico Gregorio and improved by Vafa Khalighi and I've just \
packed and redistributed it under the name of the \
multiple-choice package."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn63722"

RPM_NAME = "texlive-multiple-choice-2023.209.0.0.2svn63722-55.1.noarch.rpm"
RPM_HASH = "85de13db54701cf718d6bdb9dab747c517f3f1b96c6feac571075eba86d4fb958ce1e595492ee101b3b872299ebe6c79178daa287691138c672ff58501cfbaaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multiple-choice.sty \
texlive-multiple-choice"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biditools.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
