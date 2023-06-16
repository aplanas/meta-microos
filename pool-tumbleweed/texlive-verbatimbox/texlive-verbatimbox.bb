SUMMARY = "Deposit verbatim text in a box"
DESCRIPTION = "The package provides a verbbox environment (which uses \
techniques similar to those of the boxedverbatim environment of \
the moreverb package) to place its contents into a globally \
available box, or into a box specified by the user. The global \
box may then be used in a variety of situations (for example, \
providing a replica of the boxedverbatim environment itself). A \
valuable use is in places where the standard verbatim \
environment (which is based on a trivlist) may not appear. The \
package makes use of the verbatim package (which is a required \
part of any LaTeX distribution)."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.13svn33197"

RPM_NAME = "texlive-verbatimbox-2023.201.3.13svn33197-53.1.noarch.rpm"
RPM_HASH = "d8e90b06b4c5364a534f56c31e1a9a307ccb490053fb28358d830f6d7462490ccce05a076945a0c6874dc212c1873e690b0106fda99d61391a19ba7c38b04c16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-verbatimbox.sty \
texlive-verbatimbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-readarray.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
