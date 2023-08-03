SUMMARY = "An exam class for mathematics teachers in China"
DESCRIPTION = "This exam class is specially designed for mathematics teachers \
in China. It is used by mathcrowd.cn (an opensource math exam \
database) as the default class for exporting exam papers to \
pdf. Using BHCexam you can separate the format and the content \
very well; export both teacher paper and student paper; typeset \
multiple choice questions with 3-6 options keeping adaptively \
neat alignment; typeset cloze questions with a customizable \
underline; typeset questions with subquestions in lists; group \
questions in a list to control whether to show score, leave \
spacing, initialize question number; and more (see BHCexam \
Documentation)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7svn64093"

RPM_NAME = "texlive-bhcexam-2023.209.1.7svn64093-54.1.noarch.rpm"
RPM_HASH = "ac7449358a91d4c02a1b2c766dd20f8dc5b78d91a2f7a2b72ace9b08bfa358cb0db7f6120880696d20748492cb9d6663f1130ee1c63c9dc78510f3b3983d591d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-BHCexam.cls \
texlive-bhcexam"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-article.cls \
tex-bbding.sty \
tex-caption.sty \
tex-ctex.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-pifont.sty \
tex-romannum.sty \
tex-tabularx.sty \
tex-unicode-math.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
