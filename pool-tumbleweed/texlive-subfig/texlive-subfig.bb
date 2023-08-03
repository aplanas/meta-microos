SUMMARY = "Figures broken into subfigures"
DESCRIPTION = "The package provides support for the manipulation and reference \
of small or 'sub' figures and tables within a single figure or \
table environment. It is convenient to use this package when \
your subfigures are to be separately captioned, referenced, or \
are to be included in the List-of-Figures. A new \\subfigure \
command is introduced which can be used inside a figure \
environment for each subfigure. An optional first argument is \
used as the caption for that subfigure. This package supersedes \
the subfigure package (which is no longer maintained). The name \
was changed since the package is not completely backward \
compatible with the older package The major advantage of the \
new package is that the user interface is keyword/value driven \
and easier to use. To ease the transition from the subfigure \
package, the distribution includes a configuration file \
(subfig.cfg) which nearly emulates the subfigure package. The \
functionality of the package is provided by the (more recent \
still) subcaption package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn15878"

RPM_NAME = "texlive-subfig-2023.209.1.3svn15878-58.1.noarch.rpm"
RPM_HASH = "12967770e083e2ea975e92114fb96f31473f219e90f6e2e521e341a2e99c0ffba9c93663bbf2c67868865b3cb21629ec79b2431557c4be5e30e15b85ff1ff60f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-altsf.cfg \
tex-subfig.sty \
texlive-subfig"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-caption.sty \
tex-caption3.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
