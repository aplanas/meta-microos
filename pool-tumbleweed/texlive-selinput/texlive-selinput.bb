SUMMARY = "Semi-automatic detection of input encoding"
DESCRIPTION = "This package selects the input encoding by specifying pairs of \
input characters and their glyph names."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn53098"

RPM_NAME = "texlive-selinput-2023.201.1.6svn53098-53.1.noarch.rpm"
RPM_HASH = "a58f2df7dafa0b947f407037e2040d5a266f482309532e47103b95c07d7869ed593cfd3ca146c881273dae7561f132c6501c2482dd37c43c2fa2e69f401acbfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-selinput.sty \
texlive-selinput"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-inputenc.sty \
tex-kvoptions.sty \
tex-kvsetkeys.sty \
tex-stringenc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
