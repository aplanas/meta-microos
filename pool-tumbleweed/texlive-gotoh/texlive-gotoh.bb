SUMMARY = "An implementation of the Gotoh sequence alignment algorithm"
DESCRIPTION = "This package calculates biological sequence alignment with the \
Gotoh algorithm. The package also provides an interface to \
control various settings including algorithm parameters."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn44764"

RPM_NAME = "texlive-gotoh-2023.209.1.1svn44764-54.1.noarch.rpm"
RPM_HASH = "275f37b916390e0c1d91a2980ef139c63ca3528fe6dae6801be9aebacd45a2dcccb21bcb833b2a6f4ddd8ef189912eaaef20f87f618ff085aa32ada122867aab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gotoh.sty \
texlive-gotoh"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
