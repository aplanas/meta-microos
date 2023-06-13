SUMMARY = "BibTeX variant supporting 8-bit encodings"
DESCRIPTION = "An enhanced, portable C version of BibTeX. Enhanced by \
conversion to larger (32-bit) capacity, addition of run-time \
selectable capacity and 8-bit support extensions. National \
character set and sorting order are controlled by an external \
configuration file. Various examples are included. Originally \
written by Niel Kempson and Alejandro Aguilar-Sierra, it is now \
maintained as part of TeX Live."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.72svn66186"

RPM_NAME = "texlive-bibtex8-2023.201.3.72svn66186-53.1.noarch.rpm"
RPM_HASH = "c7f97d399caf53a15cdbb43629b0a9c35909044b87459dca3b0693607ec29ec2f163415ff3e1dbf2ead46fa54449f5bac380d5303d46a0774ee2bad74beb8d08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibtex8"

RDEPENDS:${PN} += "/bin/sh \
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
