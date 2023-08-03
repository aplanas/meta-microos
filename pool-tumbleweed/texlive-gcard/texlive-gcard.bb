SUMMARY = "Arrange text on a sheet to fold into a greeting card"
DESCRIPTION = "The package provides a simple means of producing greeting \
cards. It arranges four panels onto a single sheet so that when \
the sheet is folded twice the four panels are arranged as front \
cover, inside left and right pages, and back cover. It uses the \
textpos package for placement on the sheet and the graphicx \
package for the necessary rotation. The four panels are set in \
minipages for formatting by the user."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-gcard-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "2996b883f3a550223783fff0b287a0fa14ea0d9372608d7e6fc8010b82d3c30e9210067028488ab05c3bdbc498d093f987edb25c1fa75beaa3a42af3441c7276"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gcard.sty \
texlive-gcard"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-graphicx.sty \
tex-textpos.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
