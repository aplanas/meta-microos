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

RPM_NAME = "texlive-rcs-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "c88dcc929da632bdeff66f55373e4f77d1ad90ef652feb1c533090cf14bd300b422d8286253637891419fbca7e9e12c866a41f10c6b65bca861de462751e90cc"
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
