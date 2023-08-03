SUMMARY = "Extend LaTeX's \\ref capability"
DESCRIPTION = "The package extends the LaTeX labelling system: whenever a \
label is set, the values of counters (selected by the user) are \
recorded, along with the label. The value of these counters can \
be recalled with a command similar to \\pageref. The package \
also adds commands \\s[name]ref (for each counter [name] that \
the user has selected); these commands display something only \
if the value of the [name] counter is changed from when the \
label was set. Many commands are provided to serve as a macro \
programming environment for using the extended labels."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9svn20311"

RPM_NAME = "texlive-smartref-2023.209.1.9svn20311-58.1.noarch.rpm"
RPM_HASH = "8b84f155d8d2af74047176d74cbe1f2bb590d43e4ffa81f4fd65117edb65a5bc3b0aa8e9ce06dbf81ca0d7ad45d2c1423e47025c0043fd389ccf6324b090d0cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-byname.sty \
tex-smartref.sty \
texlive-smartref"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
