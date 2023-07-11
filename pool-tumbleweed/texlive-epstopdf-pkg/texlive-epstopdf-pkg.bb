SUMMARY = "Call epstopdf 'on the fly'"
DESCRIPTION = "The package adds support for EPS files in the graphicx package \
when running under pdfTeX. If an EPS graphic is detected, the \
package spawns a process to convert the EPS to PDF, using the \
script epstopdf. This of course requires that shell escape is \
enabled for the pdfTeX run."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.11svn53546"

RPM_NAME = "texlive-epstopdf-pkg-2023.201.2.11svn53546-53.2.noarch.rpm"
RPM_HASH = "07c31d35228f9edc52145593af6963f207e27c957ed75c2c98788e1f610cb50693f252850f1f5808b8e0bd81ac49896705f0e284f637cd63a91938aa72509cd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-epstopdf-base.sty \
tex-epstopdf.sty \
texlive-epstopdf-pkg"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-grfext.sty \
tex-infwarerr.sty \
tex-kvoptions.sty \
tex-pdftexcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
