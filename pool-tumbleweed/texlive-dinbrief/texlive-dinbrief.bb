SUMMARY = "German letter DIN style"
DESCRIPTION = "Implements a document layout for writing letters according to \
the rules of DIN (Deutsches Institut fur Normung, German \
standardisation institute). A style file for LaTeX 2.09 (with \
limited support of the features) is part of the package. Since \
the letter layout is based on a German standard, the user guide \
is written in German, but most macros have English names from \
which the user can recognize what they are used for. In \
addition there are example files showing how letters may be \
created with the package. A graphical interface for use of the \
dinbrief is provided in the dinbrief-GUI bundle."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-dinbrief-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "0213b3312619ecaaf09aab2387a8ae13205eb0d5102e51cd332df062e11df8fd5e27ef4480223a25db91fd50a29062c24663aff0dfb2977719c3f35ab7640c9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dinbrief.cfg \
tex-dinbrief.cls \
tex-dinbrief.sty \
texlive-dinbrief"

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
