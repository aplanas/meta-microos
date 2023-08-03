SUMMARY = "Define new floating environments"
DESCRIPTION = "The package offers the command \\DeclareFloatingEnvironment, \
which the user may use to define new floating environments \
which behave like the LaTeX standard foating environments \
figure and table."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1lsvn52906"

RPM_NAME = "texlive-newfloat-2023.209.1.1lsvn52906-55.1.noarch.rpm"
RPM_HASH = "37a3c375f0c8ba3897898d08f54b7d3891bc28de11d05d98d31333932f4e5ee72f24d836eb8ce2eca3b1def26c8f62585dc44e420ee9bcae8ecc21e9cd055e46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-newfloat.sty \
texlive-newfloat"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
