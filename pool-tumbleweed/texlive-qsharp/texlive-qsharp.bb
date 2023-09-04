SUMMARY = "Syntax highlighting for the Q# language"
DESCRIPTION = "The package provides syntax highlighting for the Q# language, a \
domain-specific language for quantum programming."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.1901.1401svn49722"

RPM_NAME = "texlive-qsharp-2023.209.0.0.3.1901.1401svn49722-54.2.noarch.rpm"
RPM_HASH = "ba8d4123443866d1c60a0ff7a1bfd39fa79c8adcac3f8b8c56f438ec981d0bc79040957965e7bdaa96d845444401ab177bc5b3bba08b249ab76b896b129b1efa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-qsharp.sty \
texlive-qsharp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-listings.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
