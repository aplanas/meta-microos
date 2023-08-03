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

PV = "2023.209.1.0svn62971"

RPM_NAME = "texlive-knuth-hint-2023.209.1.0svn62971-56.1.noarch.rpm"
RPM_HASH = "b5741d10130d70c3d5daec823ed78704ffe6bd1f10976733729986021d8a68a4ecb8d7e0e191cf209c99c98d5d5c9182a6934e74eeef4605dd2a36868eb5a691"
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
