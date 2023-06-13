SUMMARY = "Typeset maps and blocks according to the Information Mapping(r) method"
DESCRIPTION = "The Information Mapping(r) method provides a methodology for \
structuring and presenting information. It claims to be useful \
for readers who are more concerned about finding the right \
information than reading the document as a whole. Thus short, \
highly structured, and context free pieces of information are \
used. A LaTeX style and a LaTeX class are provided. The style \
contains definitions to typeset maps and blocks according to \
the Information Mapping(r) method. The class provides all \
definitions to typeset a whole document."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2svn44863"

RPM_NAME = "texlive-limap-2023.201.2.2svn44863-54.1.noarch.rpm"
RPM_HASH = "bc7cea6e48f65eccba106e693fda6509fafa27befb31a4f67212fc99868ae19c1b7a4e8f08c91dee5bd5e5826434fef211f5ba97c1835b6e2f513316b0372e52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(limap.cls) \
tex(limap.sty) \
texlive-limap"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(booktabs.sty) \
tex(etoolbox.sty) \
tex(fancyhdr.sty) \
tex(longtable.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
