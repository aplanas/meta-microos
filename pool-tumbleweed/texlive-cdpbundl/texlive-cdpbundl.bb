SUMMARY = "Business letters in the Italian style"
DESCRIPTION = "The C.D.P. Bundle can be used to typeset high-quality business \
letters formatted according to Italian style conventions. It is \
highly configurable, and its modular structure provides you \
with building blocks of increasing level, by means of which you \
can compose a large variety of letters. It is also possible to \
write letters divided into sections and paragraphs, to include \
floating figures and tables, and to have the relevant indexes \
compiled automatically. A single input file can contain several \
letters, and each letter will have its own table of contents, \
etc., independent from the other ones."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.36dsvn61719"

RPM_NAME = "texlive-cdpbundl-2023.209.0.0.36dsvn61719-53.1.noarch.rpm"
RPM_HASH = "934cc5c7a08743156bd00ab0ade933f5012958c3c59e6e2d416ce528473f2d974798b1357351d43707162726dcf468b9caaf7e8f4cb789042e29a2a07fb9473d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-articoletteracdp.cls \
tex-cdpaddon.sty \
tex-cdpbabel.sty \
tex-cdpnamesenglish.ldf \
tex-cdpnamesitalian.ldf \
tex-cdpshues-example.def \
tex-cdpshues.cfg \
tex-epson-stylus-740.def \
tex-hp-laserjet-4500.def \
tex-letteracdp.cls \
texlive-cdpbundl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-color.sty \
tex-eepic.sty \
tex-hyperref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
