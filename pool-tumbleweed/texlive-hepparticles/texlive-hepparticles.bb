SUMMARY = "Macros for typesetting high energy physics particle names"
DESCRIPTION = "HEPparticles is a set of macros for typesetting high energy \
particle names, to meet the following criteria: 1. The main \
particle name is a Roman or Greek symbol, to be typeset in \
upright font in normal contexts. 2. Additionally a superscript \
and/or subscript may follow the main symbol. 3. Particle \
resonances may also have a resonance specifier which is typeset \
in parentheses following the main symbol. In general the \
parentheses may also be followed by sub- and superscripts. 4. \
The particle names are expected to be used both in and out of \
mathematical contexts. 5. If the surrounding text is bold or \
italic then the particle name should adapt to that context as \
best as possible (this may not be possible for Greek symbols). \
A consequence of point 5 is that the well-known problems with \
boldness of particle names in section titles, headers and \
tables of contents automatically disappear if these macros are \
used."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn35723"

RPM_NAME = "texlive-hepparticles-2023.209.2.0svn35723-54.1.noarch.rpm"
RPM_HASH = "32f3a21829c7622f743cbf4e9e8c857785510f1d7fc031d566d718b3355fb93bccd2777372e7834cfce93c12d8e562888469d182ac12cdf64041cfb329512853"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hepparticles.sty \
texlive-hepparticles"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-subdepth.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
