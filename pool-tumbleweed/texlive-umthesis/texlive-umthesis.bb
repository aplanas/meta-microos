SUMMARY = "Dissertations at the University of Michigan"
DESCRIPTION = "The class loads book class, and makes minimal changes to it; \
its coding aims to be as robust as possible, and as a result it \
has few conflicts with potential add-on packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn15878"

RPM_NAME = "texlive-umthesis-2023.201.0.0.2svn15878-53.1.noarch.rpm"
RPM_HASH = "d25232e7d27ef34b3c2ce0054c819bbe7c436b9cee816f5f0ee2e5e89b4f998f0e2a11e5a3020ed6b7e8f1dfc71e612423aaf2fbc53146b12320f3bcc0548e54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(umthesis.cls) \
texlive-umthesis"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(book.cls) \
tex(etex.sty) \
tex(hyperref.sty) \
tex(ifthen.sty) \
tex(setspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
