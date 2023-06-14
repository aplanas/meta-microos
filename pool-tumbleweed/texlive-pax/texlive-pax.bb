SUMMARY = "Extract and reinsert PDF annotations with pdfTeX"
DESCRIPTION = "If PDF files are included using pdfTeX, PDF annotations are \
stripped. The pax project offers a solution without altering \
pdfTeX. A Java program (pax.jar) parses the PDF file that will \
later be included. The program then writes the data of the \
annotations into a file that can be read by TeX. The LaTeX \
package pax extends the graphics package to support the scheme: \
if a PDF file is included, the package looks for the file with \
the annotation data, reads them and puts the annotations in the \
right place. Project status: experimental"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn63509"

RPM_NAME = "texlive-pax-2023.201.svn63509-51.1.noarch.rpm"
RPM_HASH = "da5fcbaa43444b9862c7b2f7a39ce6397cc4421791c71f34d8006097351f6e01ea784df2accece1fb0db586d71ea441fa474a89e81d7ba8eeaa3ac13ba71e671"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pax.jar \
tex-pax.sty \
texlive-pax"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
java \
perl-File--Which \
perl-Getopt--Long \
perl-strict \
sed \
tex-auxhook.sty \
tex-etexcmds.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-kvoptions.sty \
tex-kvsetkeys.sty \
tex-ltxcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pax-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
