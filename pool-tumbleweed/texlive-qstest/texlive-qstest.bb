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

RPM_NAME = "texlive-qstest-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "bbd286454cab659b093db44b8c9b4264e394767302e6ce0139539bec8bf94089da9786dd1a3913a6ada6c712750de68b39b212b998827ac03dcb97a2127ab92a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(makematch.sty) \
tex(qstest.sty) \
texlive-qstest"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(verbatim.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
