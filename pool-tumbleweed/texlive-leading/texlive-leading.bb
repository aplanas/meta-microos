SUMMARY = "Define leading with a length"
DESCRIPTION = "The package defines a command \\leading, whose argument is a \
<length> that specifies the nominal distance between \
consecutive baselines of typeset text. The command replaces the \
rather more difficult LaTeX command \\linespread{<ratio>}, where \
the leading is specified by reference to the font size."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn15878"

RPM_NAME = "texlive-leading-2023.209.0.0.3svn15878-55.1.noarch.rpm"
RPM_HASH = "5710e233f3b82194e5fbce8b1e190c0dd62b002ee40500bf609ce6f5b4c2df383af55aa42af9bcfaecd2cce4ae630e1d42e2f62194a824f70a2a3a87ef711ae3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-leading.sty \
texlive-leading"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
