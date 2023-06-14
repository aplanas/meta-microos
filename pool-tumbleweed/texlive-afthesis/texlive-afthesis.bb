SUMMARY = "Air Force Institute of Technology thesis class"
DESCRIPTION = "LaTeX thesis/dissertation class for US Air Force Institute Of \
Technology."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.2.7svn15878"

RPM_NAME = "texlive-afthesis-2023.201.2.7svn15878-54.1.noarch.rpm"
RPM_HASH = "013276184e77e3663e94f02516ec542d6eb33e8b12a9976f7ffc5a4b81fb015865f32dae529bef84e13c56963b48aad40edb69b64d4c312ace04dda75e95afe0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-afthes10.sty \
tex-afthes11.sty \
tex-afthes12.sty \
tex-afthesis.cls \
tex-afthesis.sty \
texlive-afthesis"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-caption2.sty \
tex-ulem.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
