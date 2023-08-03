SUMMARY = "Bidi-aware shipout macros"
DESCRIPTION = "The package adds some commands to the atbegshi package for \
proper placement of background material in the left and right \
corners of the output page, in both LTR and RTL modes. The \
package only works with xelatex format and should be loaded \
before the bidi package."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn62009"

RPM_NAME = "texlive-bidi-atbegshi-2023.209.0.0.2svn62009-54.1.noarch.rpm"
RPM_HASH = "37b9ca1a3d7b37338ff010c92f378c8129bbd48751dcaff7eba4b684d69c5de91ca860874ba8dc49faac604fbd9bc7870a83b8ef4259cc29ccc768f99f940b9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bidi-atbegshi.sty \
texlive-bidi-atbegshi"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi-ltx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
