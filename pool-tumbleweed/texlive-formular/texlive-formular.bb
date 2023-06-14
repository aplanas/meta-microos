SUMMARY = "Create forms containing field for manual entry"
DESCRIPTION = "When typesetting forms there often arises the need for defining \
fields which consist of one or more lines where the customer \
can write something down manually. This package offers some \
commands for defining such fields in a distinctive way."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0asvn15878"

RPM_NAME = "texlive-formular-2023.201.1.0asvn15878-52.1.noarch.rpm"
RPM_HASH = "9d8e3835ef78f738d996c78c636b8660a7838832b7180bf4cebe1bc4b0613143bab881df0f617711ff42d37cf23997aa5923a8748c08c124a28aaa5d583dee86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-formular.sty \
texlive-formular"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
