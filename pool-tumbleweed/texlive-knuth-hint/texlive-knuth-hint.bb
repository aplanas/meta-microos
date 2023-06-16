SUMMARY = "HINT collection of typeset C/WEB sources in TeX Live"
DESCRIPTION = "The knuth-hint package contains the large collection of HINT \
documents for many of the CWEB amd WEB sources of programs in \
the TeX Live distribution (and, for technical reasons, PDF \
documents for CTWILL and XeTeX). Each program is presented in \
its original form as written by the respective authors, and in \
the 'changed' form as used in TeX Live. Care has been taken to \
keep the section numbering intact, so that you can study the \
codes and the changes in parallel. Also included are the \
'errata' for Donald Knuth's 'Computers & Typesetting'. HINT is \
the dynamic document format created by Martin Ruckert's HiTeX \
engine that was added to TeX Live 2022. The HINT files can be \
viewed on Linux, Windows, and Android with the hintview \
application. The knuth-hint package is a showcase of HiTeX's \
capabilities."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0svn62971"

RPM_NAME = "texlive-knuth-hint-2023.201.1.0svn62971-55.1.noarch.rpm"
RPM_HASH = "ae2e675ea83057600012110e5814f86e306ee631b4dc0d94f83032c4106bb68c6fd376176a260a6069a8586a5b8109c4feffaf72413353a11e0141ee33d41901"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-knuth-hint"

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
