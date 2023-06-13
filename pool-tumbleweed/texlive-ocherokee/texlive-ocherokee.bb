SUMMARY = "LaTeX Support for the Cherokee language"
DESCRIPTION = "Macros and Type 1 fonts for Typesetting the Cherokee language \
with the Omega version of LaTeX (known as Lambda)."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn25689"

RPM_NAME = "texlive-ocherokee-2023.201.svn25689-54.1.noarch.rpm"
RPM_HASH = "d38bc7827bb9101e676974aec62915533505405155852a5f1fbc7152954a09f9e83098cadf12847feb8db61db81e6bbafb3bbe2b72ce7263b1563e858923941f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(Cherokee.tfm) \
tex(Cherokeeb.tfm) \
tex(Cherokeebo.tfm) \
tex(Cherokeeo.tfm) \
tex(cherokee.map) \
tex(lchcmr.fd) \
tex(lchenc.def) \
tex(ocherokee.sty) \
texlive-ocherokee"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(updmap.cfg) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-ocherokee-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
