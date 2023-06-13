SUMMARY = "Call epstopdf 'on the fly'"
DESCRIPTION = "The package adds support for EPS files in the graphicx package \
when running under pdfTeX. If an EPS graphic is detected, the \
package spawns a process to convert the EPS to PDF, using the \
script epstopdf. This of course requires that shell escape is \
enabled for the pdfTeX run."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.11svn53546"

RPM_NAME = "texlive-epstopdf-pkg-2023.201.2.11svn53546-53.1.noarch.rpm"
RPM_HASH = "a6069330fc03b019b9785ea2baa13d5e60bacd7954a02d1efbbd2ac35179d4cf787cfd007b6f99d386b290643a53687516b0bc6fcba2a24e394f54e04291758d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(epstopdf-base.sty) \
tex(epstopdf.sty) \
texlive-epstopdf-pkg"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(grfext.sty) \
tex(infwarerr.sty) \
tex(kvoptions.sty) \
tex(pdftexcmds.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
