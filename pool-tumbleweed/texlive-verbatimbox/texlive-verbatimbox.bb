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

PV = "2023.209.3.13svn33197"

RPM_NAME = "texlive-verbatimbox-2023.209.3.13svn33197-54.1.noarch.rpm"
RPM_HASH = "1e5baeb200ecd5899e5efe90ae168af5032e19fe85bd61aed2196fc4af608ebe640754e948ead4a066ef22a0a53296e970a0faebe7378b4d1281953a63c4c8d4"
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
