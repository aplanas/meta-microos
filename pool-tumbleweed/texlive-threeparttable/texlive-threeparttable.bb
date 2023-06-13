SUMMARY = "Tables with captions and notes all the same width"
DESCRIPTION = "Provides a scheme for tables that have a structured note \
section, after the caption. This scheme provides an answer to \
the old problem of putting footnotes in tables -- by making \
footnotes entirely unnecessary. Note that a threeparttable is \
not a float of itself; but you can place it in a table or a \
table* environment, if necessary."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn17383"

RPM_NAME = "texlive-threeparttable-2023.201.svn17383-54.1.noarch.rpm"
RPM_HASH = "fa23e4d20685986260e9fa50f07a0be864a5b6dc951a71fbee4a1a281e3dd922a8172b4b8c94d8a03becf1081848f50258d74ee0f2fd0bc2085dc1ad125cf5a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(3parttable.sty) \
tex(threeparttable.sty) \
texlive-threeparttable"

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
