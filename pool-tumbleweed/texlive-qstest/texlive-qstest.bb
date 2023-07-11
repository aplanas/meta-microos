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

PV = "2023.201.svn15878"

RPM_NAME = "texlive-qstest-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "b9b6adaa383dd2d2e8174692414069eba7f70c3b81322004185292d69cc4f7f7bb21fcf9d06e9b33aed9028eb36910faf9f7884968c0729f61918b550f42ca1e"
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
