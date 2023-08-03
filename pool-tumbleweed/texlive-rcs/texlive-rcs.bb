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

PV = "2023.209.svn15878"

RPM_NAME = "texlive-rcs-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "1acfff2eeefb9283e0f41c0b36c043feeeda39acb557cabd2395862d16293c4171f3d6baf393bd67b8e82cb1337d6b9d7b682344bc1e97bb66dd8e351ce6dae4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rcs.sty \
texlive-rcs"

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
