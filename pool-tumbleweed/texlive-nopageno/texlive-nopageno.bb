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

PV = "2023.209.svn18128"

RPM_NAME = "texlive-nopageno-2023.209.svn18128-55.1.noarch.rpm"
RPM_HASH = "f65e5050254e7ab873f233aa43c76e47bf9826ea4ad2e016a24ca9c5aca465adc86b7301ec04cf7beac0417437b8912c4504ba85b3e2f632f9b17f38426ad00b"
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
