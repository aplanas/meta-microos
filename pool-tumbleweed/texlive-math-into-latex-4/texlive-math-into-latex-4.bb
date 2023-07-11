SUMMARY = "Samples from Math into LaTeX, 4th Edition"
DESCRIPTION = "Samples for the book `(More) Math into LaTeX', 4th edition. In \
addition, there are two excerpts from the book: A Short Course \
to help you get started quickly with LaTeX, including detailed \
instructions on how to install LaTeX on a PC or a Mac; Math and \
Text Symbol Tables."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn44131"

RPM_NAME = "texlive-math-into-latex-4-2023.208.svn44131-53.1.noarch.rpm"
RPM_HASH = "92554de32fec907cf1d46d9cbb6aa9d731469cacc9b14cb939c4360d28472b72e421f1f17dc14d5de73067edfd88378454cee755656a010b3decd689a169124d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-math-into-latex-4"

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
