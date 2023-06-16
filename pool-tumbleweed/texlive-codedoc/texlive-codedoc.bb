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

PV = "2023.201.0.0.3svn17630"

RPM_NAME = "texlive-codedoc-2023.201.0.0.3svn17630-53.1.noarch.rpm"
RPM_HASH = "179da777001885a1f01a52bc46b68c579ab013fb370c198401691237aad9f56d85a7446cca3bed9124cef6e752026943e16533dbd7cfbe62155a27b050de3a32"
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
