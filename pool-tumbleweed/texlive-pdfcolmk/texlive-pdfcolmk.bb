SUMMARY = "Improved colour support under pdfTeX (legacy stub)"
DESCRIPTION = "The package used to provide macros that emulated the 'colour \
stack' functionality of dvips. The colour stack deals with \
colour manipulations when asynchronous events (like \
page-breaking) occur. At the time the package was written, \
pdfTeX did not (yet) have such a stack, though dvips had had \
one for a long time. This package was an experimental solution \
to the problem, and worked best with pdfeTeX. For current \
releases of pdfTeX (later than version 1.40.0, released in \
2007), this package is not needed, since 'real' colour stacks \
are available. The present pdfcolmk is therefore just an empty \
stub that does nothing at all, just in case there are still \
documents that reference it. The documented source of the \
original package is still available at the github repository."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn52912"

RPM_NAME = "texlive-pdfcolmk-2023.201.2.0svn52912-51.1.noarch.rpm"
RPM_HASH = "91c86f2b9b553c84a7a23f3c0b4791453a8fefabf9d11adf9ad7f6c6354cf4767ad1b534623fc3a8a569559e70f2fac56f81d6e8aeda18edf1d9bfee8454b93c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pdfcolmk.sty) \
texlive-pdfcolmk"
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
