SUMMARY = "Using expl3 to implement some numerical algorithms"
DESCRIPTION = "An article, in French, based on a presentation made in \
Dunkerque for the 'stage LaTeX' on 12 June 2019. The articles \
gives three examples of code in expl3 with (lots of) comments: \
Knuth's algorithm to create a list of primes, the sieve of \
Eratosthenes, Kaprekar sequences. The package contains the code \
itself, the documentation as a PDF file, and all the files \
needed to produce it."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn54451"

RPM_NAME = "texlive-expose-expl3-dunkerque-2019-2023.201.1.2svn54451-52.1.noarch.rpm"
RPM_HASH = "1b91aa37ed7cf16aec2a25c520e3ee6d40375f60ab144ed6722e43d955d5247fa786fd8caec17e3255a80340d63159a1c5bb8d7434d1d7d0fe4536b68daf9c90"
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
