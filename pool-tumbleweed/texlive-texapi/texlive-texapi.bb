SUMMARY = "Macros to write format-independent packages"
DESCRIPTION = "Texapi provides utility macros to write format-independent (and \
-aware) packages. It is similar in spirit to the etoolbox, \
except that it isn't tied to LaTeX. Tools include: engine and \
format detection, expansion control, command definition and \
manipulation, various testing macros, string operations, and \
highly customizable while and for loops. The package requires \
e-TeX (and, should you want to compile its documentation, the \
pitex package is also needed)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.04svn54080"

RPM_NAME = "texlive-texapi-2023.209.1.04svn54080-55.1.noarch.rpm"
RPM_HASH = "13b175ef0848434e92696d821d7085caf232853698b2419cce6fe2caf32c870a06c3362290e6e06829477db0e18bddfba461dbd3a3b617b0e39212ee1c56fb28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texapi.tex \
texlive-texapi"

RDEPENDS:${PN} += "/usr/bin/sh \
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
