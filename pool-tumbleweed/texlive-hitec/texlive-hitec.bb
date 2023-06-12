SUMMARY = "Class for documentation"
DESCRIPTION = "An article-based class designed for use for documentation in \
high-technology companies."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0betasvn15878"

RPM_NAME = "texlive-hitec-2023.201.0.0.0betasvn15878-53.1.noarch.rpm"
RPM_HASH = "a1e4387fc0667f0f3d43ccae885c6fe0f829f73661f0516279ed24c8811d8e88d57341d379b7961ea0c7283ffe2da67bb36d48f0126479661eaf7856a54c0091"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hitec.cls) \
texlive-hitec"
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
