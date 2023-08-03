SUMMARY = "Find the date of last modification of a file"
DESCRIPTION = "The package fetches from the system the date of last \
modification or opening of an existing file, using the function \
\\pdffilemoddate (present in recent versions of pdfTeX); the \
user may specify how the date is to be presented."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn16189"

RPM_NAME = "texlive-getfiledate-2023.209.1.2svn16189-53.1.noarch.rpm"
RPM_HASH = "ae2aae9bdf9db37cc6be0a8b49d4fab0ff555c308580dacddd0bb1f93530a008e37c2038c3211916141166da818a09260c133ad3d8f617369100de0b578e09e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-getfiledate.sty \
texlive-getfiledate"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-boxedminipage.sty \
tex-etextools.sty \
tex-ltxnew.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
