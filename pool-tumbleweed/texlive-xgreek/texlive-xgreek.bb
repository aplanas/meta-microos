SUMMARY = "Greek Language Support for XeLaTeX and LuaLaTeX"
DESCRIPTION = "This package has been designed so to allow people to typeset \
Greek language documents using XeLaTeX or LuaLaTeX. It is \
released in the hope that people will use it and spot errors, \
bugs, features so to improve it. Practically, it provides all \
the capabilities of the greek option of the babel package. The \
package can be invoked with any of the following options: \
monotonic (for typesetting modern monotonic Greek), polytonic \
(for typesetting modern polytonic Greek), and ancient (for \
typesetting ancient texts). The default option is monotonic. \
The command \\setlanguage{<lang>} activates the hyphenation \
patterns of the language <lang>. This, however, can only be \
done if the format file has not been built with the babel \
mechanism."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.2.0svn64300"

RPM_NAME = "texlive-xgreek-2023.209.3.2.0svn64300-53.2.noarch.rpm"
RPM_HASH = "7a055f142201a7ed02df272a3071726eea70c6e7d09503857ce276f27df2c00b6f61093c7adbccf69c4ba0efebc03ed7d7c33ab290a32fdf42130b93d6f3db5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xelistings.sty \
tex-xgreek.sty \
texlive-xgreek"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-listings.sty \
tex-luahyphenrules.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
