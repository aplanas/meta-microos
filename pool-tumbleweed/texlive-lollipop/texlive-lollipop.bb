SUMMARY = "TeX made easy"
DESCRIPTION = "Lollipop is 'TeX made easy' -- it is a macro package that \
functions as a toolbox for writing TeX macros. Its main aim is \
to make macro writing so easy that implementing a fully new \
layout in TeX would become a matter of less than an hour for an \
average document. The aim is that such a task could be \
accomplished by someone with only a very basic training in TeX \
programming. Thus, Lollipop aims to make structured text \
formatting available in environments where typical users would \
switch to WYSIWYG packages for the freedom that such a \
mechanism offers. In addition, development of support for \
Lollipop documents written in RTL languages (such as Persian) \
is underway."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.07svn45678"

RPM_NAME = "texlive-lollipop-2023.209.1.07svn45678-55.1.noarch.rpm"
RPM_HASH = "662991701d2684f054dca875908dca50ce3c21dd1b7595f4f0fed0615ac7478f53d23ceb3e8c9faefe8d5ee97688b8fda15e31b99948101a91026bc862966522"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lollipop-define.tex \
tex-lollipop-document.tex \
tex-lollipop-float.tex \
tex-lollipop-fontdefs.tex \
tex-lollipop-fonts.tex \
tex-lollipop-heading.tex \
tex-lollipop-lists.tex \
tex-lollipop-output.tex \
tex-lollipop-plain.tex \
tex-lollipop-text.tex \
tex-lollipop-tools.tex \
tex-lollipop.tex \
texlive-lollipop"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-cm \
texlive-filesystem \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-lollipop-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
