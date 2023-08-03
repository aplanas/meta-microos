SUMMARY = "Macros to change text and mathematics fonts in plain XeTeX"
DESCRIPTION = "This package consists of macros that can be used to typeset \
'plain' XeTeX documents using any OpenType or TrueType font \
installed on the computer system. The macros allow the user to \
change the text mode fonts and some math mode fonts. For any \
declared font family, various font style, weight, and size \
variants like bold, italics, small caps, etc., are available \
through standard and custom TeX control statements. Using the \
optional argument of the macros, the available XeTeX font \
features and OpenType tags can be accessed. Other features of \
the package include activating and deactivating hanging \
punctuation, and support for special Unicode characters."
LICENSE = "LPPL-1.0"

PV = "2023.209.2016.1svn40404"

RPM_NAME = "texlive-font-change-xetex-2023.209.2016.1svn40404-53.1.noarch.rpm"
RPM_HASH = "1f3a723d957a746d94dcf936445385063cd92d8ebd926cf45f94d2512d6b041ba3aa1a78f49d9f2a58b66083a4ab1c4ee8d36324d35e8dc8910a681e62a3066f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-font-change-xetex.tex \
texlive-font-change-xetex"

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
