SUMMARY = "A multi-page tables package"
DESCRIPTION = "The package was a predecessor of longtable; the newer package \
(designed on quite different principles) is easier to use and \
more flexible, in many cases, but supertabular retains its \
usefulness in a few situations where longtable has problems."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.1gsvn53658"

RPM_NAME = "texlive-supertabular-2023.209.4.1gsvn53658-58.1.noarch.rpm"
RPM_HASH = "4857d3a3434ea0c1bf65792514b21b99b22348181457edea53ffc99f37a5c5d6e70bff8cfaf973f411d64d4d1f9e7ffc9955adb8eae633db0436bc61ee78e1db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-supertabular.sty \
texlive-supertabular"

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
