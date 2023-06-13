SUMMARY = "Wrapping text around stuff"
DESCRIPTION = "This package provides another implementation of text wrapping. \
Its implementation benefits from the paragraph hooks available \
since LaTeX 2021-06-01."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn64058"

RPM_NAME = "texlive-wrapstuff-2023.201.0.0.3svn64058-52.1.noarch.rpm"
RPM_HASH = "7f23cdaa88ba2c8f5a97576f5ba6dea9f32627c08c5cf52fd4489853897c90bbf9c4724b33b0b06a533664ba7fadbbf46eab44cfb60925f06bbdb30a37d2781f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(wrapstuff.sty) \
texlive-wrapstuff"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expl3.sty) \
tex(l3keys2e.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
