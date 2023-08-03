SUMMARY = "Packages for language-dependent inline quotes and dashes"
DESCRIPTION = "The bundle contains two packages: quoted, for inserting \
quotation marks; and onedash, for inserting dashes. Each \
package takes a language name as an option; accepted language \
options are american, british, german and polish."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-logical-markup-utils-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "c10131288a7d834433082ea1bd53a917235520dbbf2c6216fcb73129fa38fcb357ddb89abe43b415890a326c060ed994f6039548546184e6c7dc270570a1a88b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-onedash.sty \
tex-quoted.sty \
texlive-logical-markup-utils"

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
