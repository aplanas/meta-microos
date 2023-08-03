SUMMARY = "A module for preparing presentations"
DESCRIPTION = "This ConTeXt module provides an easy-to-use interface for \
creating presentations for use with a digital projector. The \
presentations are not interactive (no buttons, hyperlinks or \
navigational tools such as tables of contents). Graphics may be \
mixed with the text of slides. The module provides several \
predefined styles, designed for academic presentation. Most \
styles are configurable, and it is easy to design new styles."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn63903"

RPM_NAME = "texlive-context-simpleslides-2023.209.svn63903-55.1.noarch.rpm"
RPM_HASH = "4fad3e0a3e9d45644d23817424b5237599f3197cfb0ea00cbdb8fe3ce39bcb3fcb9e969e7d6cf3a89b29ac81961bd86f06a8f5322ee07b9a8ab253cbdf688558"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-s-simpleslides-BigNumber.tex \
tex-s-simpleslides-BlackBoard.tex \
tex-s-simpleslides-BottomSquares.tex \
tex-s-simpleslides-Boxed.tex \
tex-s-simpleslides-BoxedTitle.tex \
tex-s-simpleslides-Ellipse.tex \
tex-s-simpleslides-Embossed.tex \
tex-s-simpleslides-Framed.tex \
tex-s-simpleslides-FramedTitle.tex \
tex-s-simpleslides-FuzzyFrame.tex \
tex-s-simpleslides-FuzzyTopic.tex \
tex-s-simpleslides-HorizontalStripes.tex \
tex-s-simpleslides-NarrowStripes.tex \
tex-s-simpleslides-PlainCounter.tex \
tex-s-simpleslides-RainbowStripe.tex \
tex-s-simpleslides-Rounded.tex \
tex-s-simpleslides-Shaded.tex \
tex-s-simpleslides-SideSquares.tex \
tex-s-simpleslides-SideToc.tex \
tex-s-simpleslides-Split.tex \
tex-s-simpleslides-Sunrise.tex \
tex-s-simpleslides-Swoosh.tex \
tex-s-simpleslides-ThickStripes.tex \
tex-s-simpleslides-default.tex \
texlive-context-simpleslides"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
