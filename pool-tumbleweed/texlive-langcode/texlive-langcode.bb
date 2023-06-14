SUMMARY = "Simple language-dependent settings based on language codes"
DESCRIPTION = "The package provides a command \\uselangcode{<code>} to adjust \
language-dependent settings such as key words, typographical \
conventions and language codes (ISO 639-1). The package \
provides a means of selecting macros according to the specified \
code, for preparing a document that is to be separately typeset \
in different laguages. The package is dependent on the plainpkg \
package, and is already in use in the morehype and catcodes \
packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn27764"

RPM_NAME = "texlive-langcode-2023.201.0.0.2svn27764-55.1.noarch.rpm"
RPM_HASH = "fb20a339dd3b283e74cb647e13fbf1901c91ee9745410af631d164a3bf67ed97350ced062eb6a0d79890eff97e3f83e83fe8a418c3b3795aff2e4aa2baecccfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-langcode.sty \
texlive-langcode"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-dowith.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
