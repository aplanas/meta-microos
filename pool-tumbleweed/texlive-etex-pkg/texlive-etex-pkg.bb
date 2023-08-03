SUMMARY = "E-TeX support package"
DESCRIPTION = "The package provides support for LaTeX documents to use many of \
the extensions offered by e-TeX; in particular, it modifies \
LaTeX's register allocation macros to make use of the extended \
register range. The etextools package provides macros that make \
more sophisticated use of e-TeX's facilities."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.7svn41784"

RPM_NAME = "texlive-etex-pkg-2023.209.2.7svn41784-53.1.noarch.rpm"
RPM_HASH = "976b7bf99b6fb5f279996796daaca3625d16577ce79c6040814642b49311e2084423dcd1c8db1679f2be2d1f8fb10015a832265ab0b80d02d97e3c538540dab5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-etex.sty \
texlive-etex-pkg"

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
