SUMMARY = "BibTeX variant supporting 8-bit encodings"
DESCRIPTION = "An enhanced, portable C version of BibTeX. Enhanced by \
conversion to larger (32-bit) capacity, addition of run-time \
selectable capacity and 8-bit support extensions. National \
character set and sorting order are controlled by an external \
configuration file. Various examples are included. Originally \
written by Niel Kempson and Alejandro Aguilar-Sierra, it is now \
maintained as part of TeX Live."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.72svn66186"

RPM_NAME = "texlive-bibtex8-2023.209.3.72svn66186-54.1.noarch.rpm"
RPM_HASH = "384f79927b2f67470f1c8a33e6c08bfe8c071b8b0541d669c0e4a0c5ccdccbbeb608ba1644dff089203b02accb5796b76d0ef7b3facee6215e94b237c2240ceb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibtex8"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-bibtex8-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
