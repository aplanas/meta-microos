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

PV = "2023.201.1.9svn20311"

RPM_NAME = "texlive-smartref-2023.201.1.9svn20311-57.1.noarch.rpm"
RPM_HASH = "9a9c6bb2eb98fcf36953779522cf724f2349412b06a2f1bd6666025ca1451ab08e4eae29ba3ab5055a83396a9eb44d585b7a99855eb34faf150a52a9285ffa22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-byname.sty \
tex-smartref.sty \
texlive-smartref"

RDEPENDS:${PN} += "/bin/sh \
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
