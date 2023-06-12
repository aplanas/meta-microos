SUMMARY = "Use RCS (revision control system) tags in LaTeX documents"
DESCRIPTION = "The rcs package utilizes the inclusion of RCS supplied data in \
LaTeX documents. It's upward compatible to *all* rcs styles I \
know of. In particular, you can easily access values of every \
RCS field in your document put the checkin date on the \
titlepage put RCS fields in a footline You can typeset revision \
logs. Not in verbatim -- real LaTeX text! But you need a \
configurable RCS for that. Refer to the user manual for more \
detailed information. You can also configure the rcs package \
easily to do special things for any keyword. This bundle comes \
with a user manual, an internal interface description, full \
documentation of the implementation, style information for \
AUC-TeX, and test cases."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-rcs-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "ad92bdf6096660d741609dd9ec84b6b95411aaaa2182b8fdb20d8ff757c5e20ef9774fc729342852aaec593b4c00d3e17962183e5fd0d7eb9a0b9c44a2ecbd96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(rcs.sty) \
texlive-rcs"
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
