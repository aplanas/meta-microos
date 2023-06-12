SUMMARY = "Styles for various Physics Journals (old version)"
DESCRIPTION = "This is an old version of revtex, and is kept as a courtesy to \
users having difficulty with the incompatibility of that latest \
version."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.0asvn56589"

RPM_NAME = "texlive-revtex4-2023.201.4.0asvn56589-53.1.noarch.rpm"
RPM_HASH = "ed366efbf5f6a123ebbf3ce23748c1441528892aa8a5e84a0a7b8e2644b51597d1f4717343cc3aea2ba33c1e65285d246e74f9921db155408e30521cbab3ab3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(10pt.rtx) \
tex(11pt.rtx) \
tex(12pt.rtx) \
tex(aps.rtx) \
tex(revsymb.sty) \
tex(revtex4.cls) \
tex(rmp.rtx) \
texlive-revtex4"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(hyperref.sty) \
tex(natbib.sty) \
tex(url.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
