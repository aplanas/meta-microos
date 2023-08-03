SUMMARY = "Create forms containing field for manual entry"
DESCRIPTION = "When typesetting forms there often arises the need for defining \
fields which consist of one or more lines where the customer \
can write something down manually. This package offers some \
commands for defining such fields in a distinctive way."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0asvn15878"

RPM_NAME = "texlive-formular-2023.209.1.0asvn15878-53.1.noarch.rpm"
RPM_HASH = "96d2d63be128c651aa79988a33740eadeb1e20a85ee976b8f692135d0bd2364db2a46352997636aaf0b753ddc53601b39d32066aad655f489830e26f7acc2706"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-formular.sty \
texlive-formular"

RDEPENDS:${PN} += "/usr/bin/sh \
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
