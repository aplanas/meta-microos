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

PV = "2023.209.svn63509"

RPM_NAME = "texlive-pax-2023.209.svn63509-52.1.noarch.rpm"
RPM_HASH = "e9dad173d9ab68d7f24e173252cf3a135b4aa99ff929fad8fff205c8f34a07965ffc17b275b913e1e41f8e6b6e0e8540fa794379034aa003df7a1bd4dde277ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pax.jar \
tex-pax.sty \
texlive-pax"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
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
