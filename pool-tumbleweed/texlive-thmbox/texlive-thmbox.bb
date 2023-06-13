SUMMARY = "Decorate theorem statements"
DESCRIPTION = "The package defines an environment thmbox that presents \
theorems, definitions and similar objects in boxes decorated \
with frames and various aesthetic features. The standard macro \
\\newtheorem may be redefined to use the environment."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-thmbox-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "7d4ac5b7c6e600b690bb0d932cf20d1f068e1ee74475d85a3dc603bf88b31c13522d0c362f694153da2bd97c20f04e830e90f656a8f41c6c1436779e5f91a73e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(thmbox.sty) \
texlive-thmbox"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(keyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
