SUMMARY = "Lists in TeX's 'mouth'"
DESCRIPTION = "The package was developed to provide flexible lists, whose \
ordering can be altered on the fly. The implementation involves \
a pile of lambda-calculus and list-handling macros of an \
incredibly obtuse nature. The TUGboat paper serves as a manual \
for the macros. Having said all of which, confidence is \
enhanced by the knowledge that the TeX code was formally \
verified."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0asvn17691"

RPM_NAME = "texlive-lazylist-2023.201.1.0asvn17691-54.1.noarch.rpm"
RPM_HASH = "b5c716123fe555aa8be56235c4da8d65292ad26046263e7500fbb82c44d45a08c9b9844628cf23b1f0a641fe479280cc00222fed754c18e27c73311996c09775"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lazylist.sty) \
texlive-lazylist"

RDEPENDS:${PN} += "/bin/sh \
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
