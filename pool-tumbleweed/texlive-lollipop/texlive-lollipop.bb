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

PV = "2023.201.1.07svn45678"

RPM_NAME = "texlive-lollipop-2023.201.1.07svn45678-54.1.noarch.rpm"
RPM_HASH = "ff84f62198c418ddb406b4a8dd997ae0127d3ad7494d2157a9c2ec001bbb629c235bc1debab6f939596c68deaa243073a9b76667bdbcc4d5ab5d43bb94925550"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lollipop-define.tex) \
tex(lollipop-document.tex) \
tex(lollipop-float.tex) \
tex(lollipop-fontdefs.tex) \
tex(lollipop-fonts.tex) \
tex(lollipop-heading.tex) \
tex(lollipop-lists.tex) \
tex(lollipop-output.tex) \
tex(lollipop-plain.tex) \
tex(lollipop-text.tex) \
tex(lollipop-tools.tex) \
tex(lollipop.tex) \
texlive-lollipop"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(language.dat) \
tex(language.dat.lua) \
tex(language.def) \
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
