SUMMARY = "A multi-page tables package"
DESCRIPTION = "The package was a predecessor of longtable; the newer package \
(designed on quite different principles) is easier to use and \
more flexible, in many cases, but supertabular retains its \
usefulness in a few situations where longtable has problems."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.1gsvn53658"

RPM_NAME = "texlive-supertabular-2023.201.4.1gsvn53658-57.1.noarch.rpm"
RPM_HASH = "58db02149166df4186c39bbd4d09c3f8038d6668b74d80eaf9ff8bfb89559cc1395ac7e2d9d432bd1541a3e2acea44fe0c3159bf84cb9b7febe67d1950ef5c18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-supertabular.sty \
texlive-supertabular"

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
