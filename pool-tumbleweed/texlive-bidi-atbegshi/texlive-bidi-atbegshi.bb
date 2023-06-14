SUMMARY = "Bidi-aware shipout macros"
DESCRIPTION = "The package adds some commands to the atbegshi package for \
proper placement of background material in the left and right \
corners of the output page, in both LTR and RTL modes. The \
package only works with xelatex format and should be loaded \
before the bidi package."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn62009"

RPM_NAME = "texlive-bidi-atbegshi-2023.201.0.0.2svn62009-53.1.noarch.rpm"
RPM_HASH = "6a85684d498e77b97a6a21fcb98be7cd54bebc258f3cc301c5c4105f5f8a887391708e03128828086c942ab133b99c8e589c457347a18fa0814d09f753a55772"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bidi-atbegshi.sty \
texlive-bidi-atbegshi"

RDEPENDS:${PN} += "/bin/sh \
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
