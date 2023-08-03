SUMMARY = "LaTeX code and documentation in LaTeX-format file"
DESCRIPTION = "The CodeDoc class is an alternative to DocStrip (and others) to \
produce LaTeX code along with its documentation without \
departing from LaTeX's ordinary syntax. The documentation is \
prepared like any other LaTeX document and the code to be \
commented verbatim is simply delimited by an environment. When \
an option is turned on in the class options, this code is \
written to the desired file(s). The class also includes fully \
customizable verbatim environments which provide the author \
with separate commands to typeset the material and/or to \
execute it."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn17630"

RPM_NAME = "texlive-codedoc-2023.209.0.0.3svn17630-54.1.noarch.rpm"
RPM_HASH = "0e71d19f093874680ca7b48718676caa83c7bd66b972d0382b252310d4f4dc5b630eec3ead7ddfed1854e5283ddc25662f58caa011937c39f98e246b8d148c17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-codedoc.cls \
texlive-codedoc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-makeidx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
