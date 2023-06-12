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

PV = "2023.201.1.04svn54080"

RPM_NAME = "texlive-texapi-2023.201.1.04svn54080-54.1.noarch.rpm"
RPM_HASH = "edf0ec091940e1c3498edb0b19375a83c882583047bbf5b7d37d089aeec1d97002f401837c750a59a98f9891793e50f619b5e64daa5e75c463ffe40972ebd039"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(texapi.tex) \
texlive-texapi"
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
