SUMMARY = "No page numbers in LaTeX documents"
DESCRIPTION = "LaTeX's standard styles use two page styles, one on normal \
pages and one on 'opening' pages with \\maketitle or \\chapter, \
etc. Unfortunately there is only easy access to changing one of \
these two so if you want something other than 'plain' on the \
opening pages you must use \\thispagestyle on each such page. \
The fancyhdr package does provide a more flexible interface, \
but if you just want an empty page style on all pages then this \
package will do the job."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn18128"

RPM_NAME = "texlive-nopageno-2023.201.svn18128-54.1.noarch.rpm"
RPM_HASH = "225dabf016d79b6130e178366650a64ba5d211bd443d593746572b53577243a85cfe5495335fbeb883689eb5b7ab14a555784f941e278128adb0528f30bf9562"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nopageno.sty \
texlive-nopageno"

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
