SUMMARY = "Store and compose strings"
DESCRIPTION = "This is a package to store and compose strings in a structured \
way. This can serve various purposes, for example: manage and \
write document metadata; use templates for formatting document \
data; assist in assembling and displaying document license \
information; facilitate basic internationalisation and \
localisation."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.2svn56246"

RPM_NAME = "texlive-metastr-2023.201.1.1.2svn56246-54.1.noarch.rpm"
RPM_HASH = "d37dbdc244d6a0d07c46f682e817ec43af7a1b3b24237cb7b407e88e5c79732919ab8f58a728b281cb3ca25a77cea45efc8a20f6f482109198aa6fb49cf718bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(metastr.sty) \
texlive-metastr"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(hyperref.sty) \
tex(hyperxmp.sty) \
tex(keyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
