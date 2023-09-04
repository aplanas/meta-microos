SUMMARY = "Bundle for unit tests and pattern matching"
DESCRIPTION = "This is the public release of the qstest bundle (written for \
DocScape Publisher) (C) 2006, 2007 QuinScape GmbH. The bundle \
contains the packages 'makematch' for matching patterns to \
targets (with a generalization in the form of pattern lists and \
keyword lists), and 'qstest' for performing unit tests, \
allowing the user to run a number of logged tests ensuring the \
consistency of values, properties and call sequences during \
execution of test code. Both packages make extensive use of in \
their package documentation, providing illustrated examples \
that are automatically verified to work as expected. Check the \
README file for details."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-qstest-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "1c58a047cd1a37a8486b1f6fead16e0441a734865f9133f5e7b90ba21cb6c68e9646dc930e2bcfe9680d43dd41b1f33fdfa29700576a9539d312887690f2dc3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-makematch.sty \
tex-qstest.sty \
texlive-qstest"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
