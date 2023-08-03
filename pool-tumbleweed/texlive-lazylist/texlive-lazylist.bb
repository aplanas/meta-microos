SUMMARY = "Lists in TeX's 'mouth'"
DESCRIPTION = "The package was developed to provide flexible lists, whose \
ordering can be altered on the fly. The implementation involves \
a pile of lambda-calculus and list-handling macros of an \
incredibly obtuse nature. The TUGboat paper serves as a manual \
for the macros. Having said all of which, confidence is \
enhanced by the knowledge that the TeX code was formally \
verified."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0asvn17691"

RPM_NAME = "texlive-lazylist-2023.209.1.0asvn17691-55.1.noarch.rpm"
RPM_HASH = "9d07c1e057bc3bfd5d2461254bbab17f19578d682519a3359c2db057a08fd64718e171b9245229e02fb23f33165750cf427be797fbc964c33e8e10bd8e4adbff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lazylist.sty \
texlive-lazylist"

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
