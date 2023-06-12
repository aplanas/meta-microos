SUMMARY = "A TeX format for physics papers"
DESCRIPTION = "PSIZZL is a TeX format for physics papers written at SLAC and \
used at several other places. It dates from rather early in the \
development of TeX82; as a result, some of the descriptions of \
limitations look rather quaint to modern eyes."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.35svn15878"

RPM_NAME = "texlive-psizzl-2023.201.0.0.35svn15878-52.1.noarch.rpm"
RPM_HASH = "405c14019ee58d7b4de8f13c0c2b9238d981809ab938833aa2f3247c076c82fa38d26e985ce1b53696ef3a9a45079a05b47e20a5e907cba2a2a0344a15fb68ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mypsizzl.tex) \
tex(psizzl.tex) \
texlive-psizzl"
RDEPENDS:${PN} += "/bin/sh \
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
