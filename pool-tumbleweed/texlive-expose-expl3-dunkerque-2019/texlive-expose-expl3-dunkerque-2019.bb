SUMMARY = "Using expl3 to implement some numerical algorithms"
DESCRIPTION = "An article, in French, based on a presentation made in \
Dunkerque for the 'stage LaTeX' on 12 June 2019. The articles \
gives three examples of code in expl3 with (lots of) comments: \
Knuth's algorithm to create a list of primes, the sieve of \
Eratosthenes, Kaprekar sequences. The package contains the code \
itself, the documentation as a PDF file, and all the files \
needed to produce it."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn54451"

RPM_NAME = "texlive-expose-expl3-dunkerque-2019-2023.209.1.2svn54451-53.1.noarch.rpm"
RPM_HASH = "a96885784dd29ec3a46d12282260ccd6ee37f028309db17a8d145eb29b07157811918775584e06a5200f8cf7edd18faf42f7a4f088a558c686430fbf2514946c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-expose-expl3-dunkerque-2019"

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
