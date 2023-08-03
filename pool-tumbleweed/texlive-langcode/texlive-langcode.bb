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

PV = "2023.209.0.0.2svn27764"

RPM_NAME = "texlive-langcode-2023.209.0.0.2svn27764-56.1.noarch.rpm"
RPM_HASH = "87b324e50dc6c187bfa7ca6d89825946af507fd04e3d97e3ba20c9167b2416f4da5c7b7712d71bc78c06b7801311ff52e44ad136bb1473556703380bf67ece9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-langcode.sty \
texlive-langcode"

RDEPENDS:${PN} += "/usr/bin/sh \
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
