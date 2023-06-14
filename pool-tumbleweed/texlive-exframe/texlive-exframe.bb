SUMMARY = "Framework for exercise problems"
DESCRIPTION = "This LaTeX2e package provides a general purpose framework to \
describe and typeset exercises and exam questions along with \
their solutions. The package features mechanisms to hide or \
postpone solutions, to assign and handle points, to collect \
problems on exercise sheets, to store and use metadata, and to \
implement a consistent numbering. It also provides a very \
flexible interface for configuring and customising the \
formatting, layout, and representation of the exercise content."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.4svn53911"

RPM_NAME = "texlive-exframe-2023.201.3.4svn53911-52.1.noarch.rpm"
RPM_HASH = "3a085f0909faf62cf588457ab009280a0fc1d2414e3c49ed5dffc6695150289b3cd290fa9b7e9e18daa3ac9998a3ae1a24977637108cafe1bf3edc5f0e644841"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-exframe.sty \
texlive-exframe"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-metastr.sty \
tex-verbatim.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
