SUMMARY = "Extract subsets of documents"
DESCRIPTION = "The package defines an exercice environment which numbers every \
exercise, and a command \\get to extract a collection whose \
argument is a comma-separated set of exercise index numbers. \
While the package was designed for teachers constructing tables \
of exercises, it plainly has more general application."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.05.34svn27369"

RPM_NAME = "texlive-ktv-texdata-2023.201.05.34svn27369-55.1.noarch.rpm"
RPM_HASH = "eba7fc45ecf93bb033921a0a814854df55ca20b991c8ab046455d875cdb5b57517913f16350c4f38caa602040149ba3a976f7f5f0afa1aa29b4c54376ed96050"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ktv-buildnum.sty \
tex-ktv-texdata.sty \
texlive-ktv-texdata"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
